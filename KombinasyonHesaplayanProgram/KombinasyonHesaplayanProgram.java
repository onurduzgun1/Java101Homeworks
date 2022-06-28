package Java101Odevler.KombinasyonHesaplayanProgram;
import java.util.Scanner;
public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = scan.nextInt();
        System.out.println(number + "! = " + factorial(number));

        System.out.print("Enter a number n = ");
        int n = scan.nextInt();
        System.out.print("Enter a number r = ");
        int r = scan.nextInt();
        System.out.println("C("+ n + "," + r + ") = " + combination(n, r));
    }

    public static int factorial (int number) {
        int toplam = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                toplam *= i;
            }
        }
        return toplam;
    }
    public static int combination (int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
