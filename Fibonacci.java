import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        // fibanoci series
        int n,i,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the of n:");
        n=s.nextInt();
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=a;
        }
    }
}
