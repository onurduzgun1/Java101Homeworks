package Java101Odevler.CiftSayiBulanProgram;
import  java.util.Scanner;
public class CiftSayiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int year = scanner.nextInt();
        int[] evenNumber = new int[(year / 2) + 1];

        for (int i = 0; i <= year; i++) {
            if (i % 2 == 0) {
                evenNumber[i / 2] = i;
            }
        }

        for (int i : evenNumber) {
            System.out.print(i + " ");
        }
    }
}
