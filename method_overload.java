class overload{
    int add(int a, int b){
        return(a+b);
    }
    int add(int a, int b, int c){
        return(a+b+c);
    }
    double add(double a, double b){
        return(a+b);
    }
}
public class method_overload {
    public static void main(String[] args) {
        overload o= new overload();
        int a1,a2;
        double a3;
        a1=o.add(5, 10);
        a2=o.add(5, 10, 20);
        a3=o.add(10.5,20.5);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
