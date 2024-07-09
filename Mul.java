import java.util.*;
public class Mul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i,t;
        System.out.println("Enter a number: ");
        n=s.nextInt();
        for(i=1;i<11;i++){
            t=n*i;
            System.out.println(n+" * " + i + " = " + t);
        }
    }
}
