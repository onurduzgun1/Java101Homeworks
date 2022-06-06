package Java101Odevler.HesapMakinesi;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama Sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma Sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma Sonucu : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölme sonucu : " + (n1 / n2));
                } else {
                    System.out.print("Sayi 0'a Bölünemez");
                }
                break;
            default:
                System.out.print("Yanlış Seçim Yaptınız Tekrar Deneyin!!!");
        }

    }
}
