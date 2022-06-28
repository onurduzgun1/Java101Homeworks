package Java101Odevler.GirilenSayiyaKadar4ve5KuvvetleriniYazdiranProgram;
import java.util.Scanner;
public class GirilenSayiyaKadar4ve5KuvvetleriniYazdiranProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(number+ " The exponent of 4 is: ");
        for (int i=1; i <= number; i*=4){
            System.out.print(i + "   ");
        }
        System.out.println(" ");
        System.out.println(number + " The exponent of 5 is: ");
        for (int i=1; i <= number; i*=5){
            System.out.print(i + "   ");
        }
    }
}
