package Java101Odevler.BurcBulanProgram;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month you were born as a number: ");
        month = input.nextInt();
        System.out.print("Enter your birthday as a number: ");
        day = input.nextInt();

        if((month == 1 && day >= 22) || (month == 2 && day <= 19)){

            System.out.print("Your zodiac sign is Aquarius");

        }else if((month == 2 && day >= 20) || (month == 3 && day <= 20)){

            System.out.print("Your zodiac sign is Pisces");

        }else if((month == 3 && day >= 21) || (month == 4 && day <= 20)){

            System.out.print("Your zodiac sign is Aries");

        }else if((month == 4 && day >= 21) || (month == 5 && day <= 21)){

            System.out.print("Your zodiac sign is Taurus");

        }else if((month == 5 && day >= 22)||(month == 6 && day <= 22)){

            System.out.print("Your zodiac sign is Gemini");

        }else if((month == 6 && day >= 23) || (month == 7 && day <= 22)){

            System.out.print("Your zodiac sign is Cancer");

        }else if((month == 7 && day >= 23) || (month == 8 && day <= 22)){

            System.out.print("Your zodiac sign is Leo");

        }else if((month == 8 && day >= 23) || (month == 9 && day <= 22)){

            System.out.print("Your zodiac sign is Virgo");

        }else if((month == 9 && day >= 23) || (month == 10 && day <= 22)){

            System.out.print("Your zodiac sign is Libra");

        }else if((month == 10 && day >= 23) || (month == 11 && day <= 21)){

            System.out.print("Your zodiac sign is Scorpio");

        }else if((month == 11 && day >= 22) || (month == 12 && day <= 21)){

            System.out.print("Your zodiac sign is Sagittarius");

        }else if((month == 12 && day >=22) || (month == 1 && day <= 21)){

            System.out.print("Your zodiac sign is Capricorn");

        }else {
            System.out.print("Check your month or day and try again!");
        }
    }
}
