package Java101Odevler.TekSayiGirilinceCiftSayilarinToplami;
import java.util.Scanner;
public class TekSayiGirilinceCiftSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int control = 0;
        int total = 0;
        while(control == 0)
        {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if(number % 2 == 0) {
                    total += number;
            }
            else
                control = 1;
        }

        System.out.println("The sum of the numbers that are multiples of 2 and 4 in the numbers you enter: " + total);
    }
}
