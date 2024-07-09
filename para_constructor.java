class person{
    int age,id;
    person(int x,int y){
        age=x;
        id=y;
    }
    void display(){
        System.out.println("Person age= "+age);
        System.out.println("Person id= "+id);
    }
}
public class para_constructor {
    public static void main(String[] args) {
        person p = new person(19,2552);
        p.display();
    }
}
