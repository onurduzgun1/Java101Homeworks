package Java101Odevler.FindThePerfectNumber;
import java.util.Scanner;
public class FindThePerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0 ;

        System.out.print("Enter the number that will query the perfect number: ");
        n= input.nextInt();

        for(int i=n-1 ; i>=1 ; i--){

            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Your number is perfect.");
        }else{
            System.out.println("Your number is not a perfect number.");
        }
    }
}
