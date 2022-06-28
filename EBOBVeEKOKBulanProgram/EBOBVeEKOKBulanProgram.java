package Java101Odevler.EBOBVeEKOKBulanProgram;
import java.util.Scanner;
public class EBOBVeEKOKBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0,num2 = 0,gthan,divide = 1,ebob=1,ekok=1;
;
        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();

        if(num1 > num2)
            gthan = num1;
        else
            gthan = num2;


        while(divide < gthan)
        {
            if((num1 % divide == 0) && (num2 % divide == 0))
                ebob = divide;
            divide++;
        }

        ekok = (num1 * num2)/ebob;
        System.out.println("EBOB of two numbers: "+ ebob + " and EKOK : " + ekok);

    }
}