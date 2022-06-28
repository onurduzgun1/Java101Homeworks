package Java101Odevler.Fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int k,n1=0,n2=1,n3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        k = input.nextInt();

        for (int i = 2  ;i<=k;i++){
            n3=n1+n2;
            System.out.print(n1 + " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
