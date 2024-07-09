class Test{
    void swap(int x,int y){
        int t;
        t=x;
        x=y;
        y=t;
    }
}
public class call_by_value {
    public static void main(String[] args) {
        int a=10,b=20;
        Test t =new Test();
        System.out.println("Before calling function "+a+" "+b);
        t.swap(a, b);
        System.out.println("After calling function "+a+" "+b);
    }
}
