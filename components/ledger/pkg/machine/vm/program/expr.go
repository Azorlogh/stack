package program

import "github.com/formancehq/ledger/pkg/machine/internal"

const (
	OP_ADD = byte(iota + 1)
	OP_SUB
	OP_EQ
	OP_NEQ
	OP_LT
	OP_LTE
	OP_GT
	OP_GTE
)

type Expr interface {
	isExpr()
}

type ExprLiteral struct {
	Value internal.Value
}

func (e ExprLiteral) isExpr() {}

// Arithmetic

type ExprNumberAdd struct {
	Lhs Expr
	Rhs Expr
}

func (e ExprNumberAdd) isExpr() {}

type ExprNumberSub struct {
	Lhs Expr
	Rhs Expr
}

func (e ExprNumberSub) isExpr() {}

type ExprMonetaryAdd struct {
	Lhs Expr
	Rhs Expr
}

func (e ExprMonetaryAdd) isExpr() {}

type ExprMonetarySub struct {
	Lhs Expr
	Rhs Expr
}

func (e ExprMonetarySub) isExpr() {}

// Conditionals

type ExprNumberCondition struct {
	Lhs Expr
	Op  byte
	Rhs Expr
}

func (e ExprNumberCondition) isExpr() {}

// type ExprNumberSub struct {
// 	Lhs Expr
// 	Rhs Expr
// }

// func (e ExprNumberSub) isExpr() {}

// Other

type ExprVariable string

func (e ExprVariable) isExpr() {}

type ExprTake struct {
	Amount Expr
	Source ValueAwareSource
}

func (e ExprTake) isExpr() {}

type ExprTakeAll struct {
	Asset  Expr
	Source Source
}

func (e ExprTakeAll) isExpr() {}

type ExprMonetaryNew struct {
	Asset  Expr
	Amount Expr
}

func (e ExprMonetaryNew) isExpr() {}

type ExprTernary struct {
	Cond    Expr
	IfTrue  Expr
	IfFalse Expr
}

func (e ExprTernary) isExpr() {}