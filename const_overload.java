class person{
    int id,age; 
    String name;
    person(){
        id=10;
        age=20;
        name="jayaraj";
    }
    person(int a, int b,String c){
        id=a;
        age=b;
        name=c;
    }
    void display(){
        System.out.println("id: "+id+"\n"+"age: "+age+"\n"+"name: "+name);
    }
}
public class const_overload {
    public static void main(String[] args) {
        person o1= new person();
        o1.display();
        person o2= new person();
        o2.display();
    }
}
