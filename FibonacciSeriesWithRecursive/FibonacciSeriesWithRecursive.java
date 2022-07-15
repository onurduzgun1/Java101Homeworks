package Java101Odevler.FibonacciSeriesWithRecursive;
import java.util.Scanner;
public class FibonacciSeriesWithRecursive {
    public static int Fibo(int step) {

        if (step == 1 || step == 2) {
            return 1;
        }
        return Fibo(step - 1) + Fibo(step - 2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the step number: ");
        int num = scan.nextInt();
        System.out.println(Fibo(num));

    }
}
