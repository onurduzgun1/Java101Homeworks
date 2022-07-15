package Java101Odevler.PalidromeNumbers;

import java.util.Scanner;

public class PalidromeNumbers {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println("Palindromes is a number. ");
            return true;
        } else {
            System.out.println("Palindromes is not a number. ");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = inp.nextInt();
        System.out.println(isPalindrom(n));
    }
}
