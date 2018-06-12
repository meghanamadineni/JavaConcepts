package JavaConcepts.PassByValue;
/* Java uses pass by value.
Primitives work as expected in pass by value.
Object references are passed by value.
That is object in function signature points to the object passed until dereference takes place.
Arrays also work the same way as objects.
 */
public class PassByValue {
    public static void main(String[] args) {

        Dog myDog = new Dog("Rover");
        System.out.println(myDog.getName()); //Rover
        foo(myDog);
        System.out.println(myDog.getName()); // Max

    }

    public static void foo(Dog someDog) {
        System.out.println(someDog.getName()); //Rover

        someDog.setName("Max");
        System.out.println(someDog.getName()); //Max

        someDog = new Dog("Fifi");
        System.out.println(someDog.getName()); //Fifi

        someDog.setName("Rowlf");
        System.out.println(someDog.getName()); //Rowlf
    }
}
class Dog {
    String name;

    //Constructor
    public Dog(String name) {
        this.name = name;
    }

    // Setters and Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
