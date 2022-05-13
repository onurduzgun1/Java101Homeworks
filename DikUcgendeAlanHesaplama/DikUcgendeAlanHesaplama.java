package Java101Odevler.DikUcgendeAlanHesaplama;
import java.util.Scanner;
public class DikUcgendeAlanHesaplama {
    public static void main(String[] args) {
        int a, b;
        double hipotenus, uDeger, cevre, alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = girdi.nextInt();

        hipotenus = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + hipotenus);

        uDeger = (a+b+hipotenus)/2;

        cevre = 2 * uDeger;
        System.out.println("Üçgenin Çevresi: " + cevre);

        alan = Math.sqrt((uDeger*(uDeger-a)*(uDeger-b)*(uDeger-hipotenus)));
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
