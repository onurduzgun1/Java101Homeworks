package Java101Odevler.ExponentialNumberCalculator;
import java.util.Scanner;
public class ExponentialNumberCalculator {
    static int exponent(int base, int exponent){
        Scanner scan = new Scanner(System.in);

        if(exponent==1){
            return base;
        }
        if(exponent==0){
            return 1;
        }

        return exponent(base,exponent-1)*exponent(base,1);

    }

    public static void main(String[] args) {
        int base,exponent;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = scan.nextInt();
        System.out.print("Enter the exponent number: ");
        exponent = scan.nextInt();

        System.out.print("Result: "+ exponent(base,exponent));
    }
}
