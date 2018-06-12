package JavaConcepts.ClassesObjectsMethods;
/*
*  class is that it defines a new data type. Once defined, this new type can be used to
create objects of that type. Thus, a class is a template for an object, and an object is
an instance of a class.
* The data, or variables, defined within a class are called instance variables.
The code is contained within methods. Collectively, the methods and variables defined
within a class are called members of the class.
* A constructor initializes an object immediately upon creation.
* Constructors look a little strange because they have no return type, not even void. This is
because the implicit return type of a class’ constructor is the class type itself.
* constructors can take parameters.
* When we do not explicitly define a constructor for a class, then java creates a default
constructor for the class. It is essentially a non-parameterized constructor, i.e. it doesn't
accept any arguments. The default constructor's job is to call the super class
constructor and initialize all instance variables
* for a method to access the object that oinvoked it, this keyword is used.
* instance variable hiding - local vars and function parameters can have same names as
class instance vars. eg : this.id = id;
* Java takes a different approach; it handles deallocation for you automatically.
The technique that accomplishes this is called garbage collection. It works like this: when no
references to an object exist, that object is assumed to be no longer needed, and the memory
occupied by the object can be reclaimed.
* Sometimes an object will need to perform some action when it is destroyed.
 Java provides a mechanism called finalization to handle this.
 To add a finalizer to a class, you simply define the finalize( ) method.
 The Java run time calls that method whenever it is about to recycle an object of that
 class.
 */
public class ClassTheory {
}
