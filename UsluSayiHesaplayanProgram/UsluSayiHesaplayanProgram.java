package Java101Odevler.UsluSayiHesaplayanProgram;
import java.util.Scanner;
public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number to prime: ");
        int numToPrime = scanner.nextInt();

        System.out.print("Exponent of number: ");
        int expOfNum = scanner.nextInt();

        int result = 1;
        for(int i=0; i< expOfNum; i++){
            result *= numToPrime;
        }

        System.out.println(result);
    }
}
