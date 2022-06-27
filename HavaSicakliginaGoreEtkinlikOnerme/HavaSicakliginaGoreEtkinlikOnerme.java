package Java101Odevler.HavaSicakliginaGoreEtkinlikOnerme;
import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        heat =scanner.nextInt();

        if(heat>25){
            System.out.print("You can go for a swim.");
        }else if(heat >=15){
            System.out.print("You can go on a picnic.");
        }else if(heat>=10 ){
            System.out.print("You can go on a picnic.");
            System.out.print("You can go to the cinema.");
        }else if (heat>=5){
            System.out.print("You can go to the cinema.");
        }else{
            System.out.print("You can go skiing.");
        }
        }
    }
