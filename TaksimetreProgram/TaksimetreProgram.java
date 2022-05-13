package Java101Odevler.TaksimetreProgram;
import java.util.Scanner;
public class TaksimetreProgram {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden Giriniz: ");
        km = input.nextInt();

        total = (km * perKM);
        total += (startPrice);

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);
    }
}
