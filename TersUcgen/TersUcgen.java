package Java101Odevler.TersUcgen;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int number=sc.nextInt();

        for (int i=number; i >0 ; i--){

            for (int k=number-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
