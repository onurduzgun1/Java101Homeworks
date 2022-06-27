package Java101Odevler.LeapYear;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = keyboard.nextInt();

        if((year >= 0) && (year % 4 == 0)){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.print(year + " is leap year.");
                }else{
                    System.out.print(year + " is not leap year.");
                }
            }else{
                System.out.print(year + " is leap year.");
            }
        }else{
            System.out.print(year + " is not leap year.");
        }
    }
}
