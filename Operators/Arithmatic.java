package JavaConcepts.Operators;
/*
* +, -, *, /, +=, -=, *=, /=, ++, -- are arithmatic operators
 */
public class Arithmatic {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        int y = x++; // y =10 and x = 11
        System.out.println("x = " + x + " and y = " + y);
        y = ++x; //y = 12 and x = 12
        System.out.println("x = " + x + " and y = " + y);
    }
}
