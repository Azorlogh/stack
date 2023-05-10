package vm

import "github.com/numary/ledger/pkg/core"

type MockupLedger map[string]MockupAccount

func (l MockupLedger) GetBalance(account core.AccountAddress, asset core.Asset) *core.MonetaryInt {
	balance := l[string(account)].Balances[string(asset)]
	return &balance
}

func (l MockupLedger) GetMeta(account core.AccountAddress, key string) core.Value {
	return l[string(account)].Balances[key]
}

type MockupAccount struct {
	Balances map[string]core.MonetaryInt
	Meta     map[string]core.Value
}