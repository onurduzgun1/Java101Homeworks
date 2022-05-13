package Java101Odevler.ManavKasaProgram;
import java.util.Scanner;
public class ManavKasaProgram {
    public static void main(String[] args) {

        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5.00;

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        double toplamTutar;

        Scanner sc = new Scanner(System.in);

        System.out.print("Armutun Kilosunu Giriniz (kg): ");
        armutKilo=sc.nextDouble();

        System.out.print("Elmanın Kilosunu Giriniz (kg): ");
        elmaKilo=sc.nextDouble();

        System.out.print("Domates Kilosunu Giriniz (kg): ");
        domatesKilo=sc.nextDouble();

        System.out.print("Muzun Kilosunu Giriniz (kg): ");
        muzKilo=sc.nextDouble();

        System.out.print("Patlıcanın Kilosunu Giriniz (kg): ");
        patlicanKilo=sc.nextDouble();

        toplamTutar = armutFiyat*armutKilo + elmaFiyat*elmaKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo
                + patlicanFiyat*patlicanKilo;

        System.out.println("| Armutun Fiyatı ve Kilosu: "+armutFiyat+" ve "+armutKilo );
        System.out.println("| Elmanın Fiyatı ve Kilosu: "+elmaFiyat+" ve "+elmaKilo);
        System.out.println("| Domates Fiyatı ve Kilosu: "+domatesFiyat+" ve "+domatesKilo);
        System.out.println("| Muzun Fiyatı ve Kilosu: "+muzFiyat+" ve "+muzKilo);
        System.out.println("| Patlıcanınz Fiyatı ve Kilosu: "+patlicanFiyat+" ve "+ patlicanKilo);
        System.out.println("| Toplam Tutar: "+toplamTutar);
    }
}
