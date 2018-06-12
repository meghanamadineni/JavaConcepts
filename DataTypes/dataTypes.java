package JavaConcepts.DataTypes;
/*
* Java is a strongly typed. This is a reason for robustness and safety of java.
* Every variable has a type, every expression has a type, and every
type is strictly defined.
* All assignments, whether explicit or via parameter passing in method calls, are checked for
type compatibility. There are no automatic coercions or conversions of conflicting types.
* 8 primitive types in java - byte, short, int, long, float, double, char, boolean.
* Size of data types is fixed to make it portable and not machine specific.
* primitive data types are non objects to have better performance.
* short and byte are promoted to int when evaluating. so wise to use int instead of short and
byte for small range values also as in iterations.
* By default, Java uses double to represent its floating-point numerals. So float is defined
differently as in program below.
* float(single precision) has 6-7 digits in decimal and double(double precision) has 15-16. float is used for currency etc.
* Unlike c/c++ char, Java char is 16 bit and supports unicode characters(support for all
languages.
* whole number value is Integer Literal.
* decimal + fractional floating point literals
* true , false - boolean literals they are not equivalent to 1 and 0.
* \ is used to represent those that cant be printed in character literals.
* String literals are in heap memory. when two string objects are assigned same string literal, they point to
same string in string pool using String.intern() method. From java7, if no one references
a string literal in pool, it is removed from heap. String is an Object.
* Variable is the basic unit of storage in Java. it has type identifier and value.Can be atomic types, class or interface.
* Dynamic initialization of variables is possible. that is value is evaluated at runtime.
* Variables have scope that defines visibility and lifetime.
* Variables are created when the scope is entered and destroyed when scope is ended.
* Automatic conversion happens when types are same or when converted to larger type.
* Java converts byte , short,long,char internally to int automatically.
*Incompatible types are converted using casting. This may lead to loss or modification of original value.
* Type promotion happens after expression evaluation. byte short char are promoted to int.
if one operand is long, promoted to long. If one is float - to float
If one is double - promoted to double. negative nos are promoted by filling left most bits with 1. there by sign extension.
* First number in 2d array declaration is no of rows and second is cols. rows - horizontal
* Arrays when accessed horizontally (case of 2D) it is more efficient because of cache cohession.
Continuous mem locations are cached. therefore less cache misses.
 */
public class dataTypes {
    public static void main(String[] args) {
        //float and double
        float g =(float) 3.1233;
        float f1 = 3.145f;
        double d2 = 3.12344;
        System.out.println(f1);//3.145

        //chars
        char c1  = 'x';
        char d1 = 89;
        System.out.println(c1); //x
        System.out.println(d1); //y (ASCII val of y is 89
        c1++;
        System.out.println(c1); //y (x got incremented)

        //booleans
        boolean b1;
        // System.out.println(b1); wrong not initialized and no default val
        b1 = false;
        System.out.println(b1); // false
        b1 = true;
        System.out.println(b1); //true
        if(b1) //b1 == true is not needed
            System.out.println("b1 is printed"); //executed
        System.out.println("10 > 9 is "+ (10 > 9)); //prints 10 > 9 is true. (10 > 9 ) is evaluated here.
                                                    // () are needed as + has higher precedence than >. Outcome of relational operator is  a boolean.


        //Literals
        String s1 = "abc\bd"; // abd   \b is backspace so c is missed
        System.out.println(s1);

        char ff = '\141'; // \ followed by 3 numbers - octal - \141 is char a
        char ff1 = '\u0061'; /* \ u followed by 4 digit number - hexa - char a*/


        //Scope
        int x =10;
        System.out.println(x); // 10
        if(x == 10){
            int y = 20;
            x = y*20;
        }
        // System.out.println(y); -- error y not in scope
        System.out.println(x); // 400


        {
            int bar = 2;
            {
                // error   int bar = 3;
                int foo =4;
            }
            int foo = 5; //no error. As the lifetime of previous foo is ended by the end of
                        //the previous block.

        }


        //Promotion

        byte b = 42;
        char c = 'b';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) /* to float*/+ (i / c) /*c to int and entire to int*/- (d * s) /* to double*/; // to double
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);

    }
}
