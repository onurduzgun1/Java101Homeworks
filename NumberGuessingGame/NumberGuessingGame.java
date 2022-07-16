package Java101Odevler.NumberGuessingGame;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Menu = """
                Welcome! This is an Number Guessing Game.
                Here You will have 5 life. If you find the right answer you will be winner.
                You can not guess number which is out of bound! At the first mistake you won't be loosing life.
                At the second time you will charged! Good Luck :) **
                """;
        Random GuessedNumber = new Random();
        int number = GuessedNumber.nextInt(25);
        System.out.println("Secret Number:  " + number);
        System.out.println(" ");

        int user = 1;
        int[] UserArray = new int[5];
        int life = 5;
        int guesses = 0;
        System.out.println(Menu);

        while (life > 0) {
            guesses += 1;
            System.out.println(" ");
            System.out.print("Your Guess: ");
            user = input.nextInt();

            if (user > 25) {
                System.out.println("Wrong Bound! You can not input more than 25!\nTry Again! \tYou Lost Life -1");
                life--;
                System.out.println("Your Remaining life: " + life);
                System.out.println(" ");
                continue;
            } else if (user < 0) {
                System.out.println("Please type a number larger than 0 next time.");
                break;
            }

            if (number != user) {
                life--;
                UserArray[life++] = user;
                System.out.println(
                        "Wrong Guess!" +
                                "\tRemaining Life: " + life +
                                "\nTry Again"
                );
                if (user < number) {
                    System.out.println("Secret Number is more than your guess!\t=> Add +5 <=");
                    life--;
                } else {
                    System.out.println("Secret number is less than your guess!\t=>Decrease -5 <= ");
                    life--;
                }
            }

            if (life == 0) {
                System.out.println(" ");
                System.out.println("No more Life!");
                System.out.println("The Secret Number: " + number);
                System.out.println("Your guesses:  " + Arrays.toString(UserArray));
            }

            if (user == number) {
                System.out.println("Congratulations! You Got This!\tThe Secret Number is: " + number);
                System.out.println("You Found in your " + guesses + ". time. ");
                System.out.println("Your Guesses: ");
                System.out.print("[");
                for (int K : UserArray) {
                    if (K != 0) {
                        System.out.print(K);
                        System.out.print(" - ");
                    }
                }
                System.out.println("]");
                //System.out.println("Your guesses:  " + Arrays.toString(UserArray));
                break;

            }
        }
    }
}
