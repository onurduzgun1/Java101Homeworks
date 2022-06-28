package Java101Odevler.FindingBigAndSmallNumbers;
import java.util.Scanner;
public class FindingBigAndSmallNumbers {
    public static void main(String[] args) {
        int a, value1 = 0, value2 = 0, max = 1, min = 1;
        Scanner input = new Scanner(System.in);
        int counter, number, nummin = 1, nummax = 1;

        System.out.print("How many numbers will you enter?: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".enter number: ");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Biggest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
