package Java101Odevler.DaireninAlanCevreHesaplama;
import java.util.Scanner;
public class DaireninAlanCevreHesaplama {
    public static void main(String[] args) {
        int yaricap;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yaricap = inp.nextInt();

        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;
        double dilimAlanı;
        double dilimAcisi;

        System.out.print("Dairenin Dilim Açısını Giriniz: ");
        dilimAcisi = inp.nextDouble();
        dilimAlanı = (pi * (yaricap * yaricap) * dilimAcisi)/360;

        System.out.println("Dairenin Dilim Açısı: " + dilimAcisi);
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Daire Dilim Alanı: " + dilimAlanı);

    }
}
