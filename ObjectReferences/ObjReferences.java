package JavaConcepts.ObjectReferences;
/*
object references are just aliases. modification to one modifies the other's value
 */
public class ObjReferences {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Sridhar");
        Person p2 = p1;
        System.out.println(p1.name);
        p2.setName("Meghana");
        System.out.println(p1.name);
    }
}
class Person{
    int id;
    String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

}