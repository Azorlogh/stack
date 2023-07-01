package main

import (
	"encoding/json"
	"fmt"
	"math/big"

	"github.com/formancehq/ledger/pkg/core"
	"github.com/formancehq/ledger/pkg/machine/script/compiler"
	"github.com/formancehq/ledger/pkg/machine/vm"
)

func main() {
	program, err := compiler.Compile(`
		// This is a comment
		vars {
			account $dest
		}
		send [COIN 99] (
			source = {
				15% from {
					@alice
					@bob
				}
				remaining from @bob
			}
			destination = $dest
		)`)
	if err != nil {
		panic(err)
	}

	s, _ := json.MarshalIndent(program, "", "\t")
	fmt.Println(string(s))

	store := vm.StaticStore(map[string]*vm.AccountWithBalances{
		"alice": {
			Account: core.Account{
				Address:  "alice",
				Metadata: map[string]string{},
			},
			Balances: map[string]*big.Int{
				"COIN": big.NewInt(10),
			},
		},
		"bob": {
			Account: core.Account{
				Address:  "bob",
				Metadata: map[string]string{},
			},
			Balances: map[string]*big.Int{
				"COIN": big.NewInt(100),
			},
		},
	})

	m := vm.NewMachine(store, map[string]string{
		"dest": "charlie",
	})

	err = m.Execute(*program)
	if err != nil {
		panic(err)
	}

	fmt.Println("Postings:")
	for _, posting := range m.Postings {
		fmt.Printf("[%v %v] %v -> %v\n", posting.Asset, posting.Amount, posting.Source, posting.Destination)
	}
	fmt.Println("Tx Meta:")
	for key, value := range m.TxMeta {
		fmt.Printf("%v: %v", key, value)
	}
}
