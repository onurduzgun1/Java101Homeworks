package Java101Odevler.ATMProjesi;
import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        String password ,username;

        int trial=3;
        Scanner a=new Scanner(System.in);
        for(int i=1;i<=trial;i++) {
            System.out.println("--Welcome to ATM Bank--");
            System.out.print("Enter your username:");
            username=a.nextLine();
            System.out.print("Enter your user password:");
            password=a.nextLine();
            if (username.equals("onur") && password.equals("123")) {
                System.out.println("Successfully logged in...");
                break;
            } else if (trial == i) {
                System.out.println("Your card is blocked, please contact the bank");
                System.exit(0);
            } else {
                System.out.println("Your password or login name is incorrect, please try again. Your remaining rights are:"+(trial-i));
            }
        }
        int choose,deposit,withdraw,x=2,p=1,balance=5000;
        while(x>=p){
            System.out.print("Select the action you want to make\n 1-Deposit money\n 2-Withdraw money\n 3-Balance Query\n 4-Exit\nYour Selection:");
            choose=a.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Enter the amount of money you will deposit:");
                    deposit = a.nextInt();
                    System.out.println("Total Balance=" + (balance + deposit));
                    System.out.println("Returning to ATM operation menu...");
                    balance += deposit;
                    break;
                case 2:
                    System.out.print("Enter the amount of money you want to withdraw:");
                    withdraw = a.nextInt();
                    if (balance >= withdraw) {
                        System.out.println("Your remaining balance" + (balance - withdraw));
                        System.out.println("Returning to ATM operation menu...");
                        balance -= withdraw;
                    } else {
                        System.out.println("You cannot withdraw more money from your balance.");
                        System.out.println("Returning to ATM operation menu...");
                    }
                    break;
                case 3:
                    System.out.println("Current balance" + balance);
                    System.out.println("Returning to ATM operation menu...");
                    break;
                case 4:
                    System.out.println("Exiting... We wish you a nice day");
                    System.exit(0);
                    break;
            }
        }
    }
}
