package JavaConcepts.Operators;
/*
* &, |, ^, !, &&, ||, ==, !=, &=, |=, ^=, ?: ternary if-else
* both the operands are boolean operands.
* && and || are short circuit operands and they give the outcome with just one operand evaluation if possible.
* for example if first one is false in && entire expression evaluates to false without evaluating the second operand.
* using parenthesis () or {} increases the precedence. (++ --)( * /)(+-) is the precedence order.
* same precedence then come from left to right.
 */
public class BooleanLogicalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = (x == 10)? 1 : 0;
        System.out.println(y); //1
    }
}
