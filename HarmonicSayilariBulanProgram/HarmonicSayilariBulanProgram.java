package Java101Odevler.HarmonicSayilariBulanProgram;
import java.util.Scanner;
public class HarmonicSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double harmonic = 0, unit = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            unit = (1.0 / i);
            harmonic += unit;
        }

        System.out.println(harmonic);
    }
}
