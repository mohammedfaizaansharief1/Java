class Test{
    int a,b;
    Test(int x,int y){
        a=x;
        b=y;
    }
    void swap(Test o){
        int t;
        t=o.a;
        o.a=o.b;
        o.b=t;
    }
}
public class call_by_ref {
    public static void main(String[] args) {
        int a=10,b=20;
        Test t = new Test(a, b);
        System.out.println("Before calling function "+a+" "+b);
        t.swap(t);
        System.out.println("After calling function "+a+" "+b);
    }
}
