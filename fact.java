import java.util.*;
public class fact {
    public static void main(String args[]){
        int i , n , fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of a given no is: " + fact);
    }
}
