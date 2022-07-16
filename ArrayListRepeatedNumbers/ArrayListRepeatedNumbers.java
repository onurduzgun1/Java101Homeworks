package Java101Odevler.ArrayListRepeatedNumbers;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListRepeatedNumbers {
    static void CreateArrayList (int[] ArrayList, int Size){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Size; i++){
            System.out.print(i + ". item of list: ");
            ArrayList[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(ArrayList));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Size of ArrayList: ");
        int size = input.nextInt();

        int[] MyArrayList = new int[size];
        CreateArrayList(MyArrayList, size);

        int[] RepeatedList = new int[MyArrayList.length];

        for (int i = 0; i < MyArrayList.length; i++) {
            RepeatedList[i] = 1;
        }
        for (int i = 0; i < MyArrayList.length; i++) {
            for (int j = 0; j < MyArrayList.length; j++) {
                if ((i != j) && (MyArrayList[i] == MyArrayList[j])) {
                    RepeatedList[i]++;
                }

            }
        }
        for (int i = 0; i < MyArrayList.length; i++) {
            for (int j = 0; j < MyArrayList.length; j++) {
                if ((i != j) && (MyArrayList[i] == MyArrayList[j])) {
                    MyArrayList[j] = 0;
                }

            }
        }

        System.out.println("ArrayList items without repeating numbers: ");
        for (int K : MyArrayList)
            if (K != 0) {
                System.out.print(K);
                System.out.print(" / ");
            }
        System.out.println();
        for (int i = 0; i < MyArrayList.length; i++) {
            if (RepeatedList[i] >= 1) {
                if (MyArrayList[i] != 0)
                    System.out.println(MyArrayList[i] + " Number Repeated " + RepeatedList[i] + " Times.");
            }
        }

        }
    }