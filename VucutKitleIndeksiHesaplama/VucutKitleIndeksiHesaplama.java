package Java101Odevler.VucutKitleİndeksiHesaplama;
import java.util.Scanner;
public class VucutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        double boy;
        double kilo;
        double vucutKitleIndeksi;

        Scanner sc=new Scanner(System.in);

        // Boy Değeri
        System.out.print("Boyunuzu Giriniz (metre): ");
        boy=sc.nextDouble();

        // Kilo Değeri
        System.out.print("Kilonuzu Giriniz (kg) : ");
        kilo=sc.nextDouble();

        //Vücut Kitle İndeksi Hesaplama
        vucutKitleIndeksi=kilo/(boy*boy);

        //Ekrana Yazdırma
         System.out.println("| Boyunuz: " + boy);
        System.out.println("| Kilonuz: "+kilo);
        System.out.println("| Vücut Kitle İndeksiniz: "+vucutKitleIndeksi);
    }
}
