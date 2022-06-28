package Java101Odevler.PrimeNumber;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        String primeNum = "";
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter ++;
                }
            }
            if (counter == 2) {
                primeNum = primeNum + i + " ";
            }
        }
        System.out.println(primeNum);
    }
}
