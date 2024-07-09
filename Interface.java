interface sample{
    int a=10,b=20;
    void add();
}
class Test1 implements sample{
    public void add(){
        System.out.println("The addition of 2 nos: "+(a+b));
    }
}
public class Interface {
    public static void main(String[] args) {
        Test1  t = new Test1();
        t.add();
    }
}
