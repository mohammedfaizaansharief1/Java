class person{
    int age;
    String name;
    person(){
        age=20;
        name="raju";
    }
    void display(){
        System.out.println("Person age= "+age);
        System.out.println("Person name= "+name);
    }
}
public class def_constructor {
    public static void main(String[] args) {
        person p = new person();
        p.display();
    }
}
