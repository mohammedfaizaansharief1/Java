abstract class test{
    abstract void calculate(int x);
}
class one extends test{
    void calculate(int x){
        System.out.println("square value: "+(x*x));
    }
}
class two extends test{
    void calculate(int x){
        System.out.println("cube value: "+(x*x*x));
    }
}
public class abst_class {
    public static void main(String[] args) {
        one o = new one();
        o.calculate(5);
        two t = new two();
        t.calculate(5);
    }
}
