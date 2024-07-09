// sub class method overrides the super class method

class one{
    void calculate(int x){
        System.out.println("The square value= "+(x*x));
    }
}
class two extends one{
    void calculate(int x){
        System.out.println("The cube value= "+(x*x*x));
    }
}
public class meth_override {
    public static void main(String[] args) {
        two t = new two();
        t.calculate(5);
    }
}
