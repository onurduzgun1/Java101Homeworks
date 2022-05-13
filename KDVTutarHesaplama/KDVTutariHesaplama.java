package Java101Odevler;
import java.util.Scanner;
public class KDVTutariHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        boolean kdvDurumu;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        kdvDurumu=(0<tutar) && (tutar<=1000);
        kdvOran=kdvDurumu ? 0.18d: 0.08d;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}
