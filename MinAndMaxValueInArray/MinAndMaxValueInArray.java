package Java101Odevler.MinAndMaxValueInArray;
import java.util.Scanner;
import java.util.Arrays;
public class MinAndMaxValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ArrayList = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(ArrayList));

        for (int k : ArrayList){
            System.out.print(k);
            System.out.print(" , ");
        }
        Arrays.sort(ArrayList);

        System.out.println();
        System.out.print("Enter a Value:  ");
        int near_number = input.nextInt();

        int minValue = ArrayList[0];
        int maxValue = ArrayList[0];

        for (int i : ArrayList){
            if (i < near_number){
                minValue = i;
            }
            if (i > near_number){
                maxValue = i;
                break;
            }
        }
        System.out.println("The nearest number smaller than the entered number:  " + minValue);
        System.out.println("The nearest number greater than the entered number:  " + maxValue);
    }
}
