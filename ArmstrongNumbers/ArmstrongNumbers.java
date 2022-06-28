package Java101Odevler.ArmstrongNumbers;
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = reader.nextInt();

        int total=0;

        while(number != 0)
        {
            total=(number%10)+total;
            number /= 10;
            System.out.println(total+ "----------"+ number);

        }

        System.out.println("Digit Total: " + total);

    }
}
