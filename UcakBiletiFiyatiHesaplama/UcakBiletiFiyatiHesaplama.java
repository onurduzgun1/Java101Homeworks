package Java101Odevler.UcakBiletiFiyatiHesaplama;
import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        double distance, pricePerKM = 0.10, priceTotal =0, discountRoundTrip, discountedPrice, discountAge=0, price;
        int age, flightType;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the distance in KM:");
        distance = keyboard.nextDouble();
        System.out.print("Enter your age:");
        age = keyboard.nextInt();
        System.out.print("Enter the flight type (One way = 1 || Round Trip = 2): ");
        flightType  = keyboard.nextInt();

        keyboard.close();

        if((distance >=0 && age >= 0) && (flightType ==1 || flightType == 2)){
            price = distance * pricePerKM;

            if(age < 12){
                discountAge = price * 0.50;
            }else if(age <= 24){
                discountAge = price * 0.10;
            }else if(age >= 65){
                discountAge = price * 0.30;
            }

            if(flightType == 2){
                discountedPrice = price - discountAge;
                discountRoundTrip = discountedPrice * 0.20;
                priceTotal = (discountedPrice - discountRoundTrip) * 2;
            }else {
                priceTotal = price - discountAge;
            }
            System.out.print("Total amount: " + priceTotal + "TL");

        }else{
            System.out.print("Ups.. Something went wrong. Check your information again!");
        }
    }
}
