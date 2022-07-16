package Java101Odevler.PalindromeWords;

public class PalindromeWords {
    static boolean IsPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return false;
    }

    static boolean IsPanlindrome2(String str){
        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.print("Onur");
        System.out.print(" ");
        System.out.println(IsPalindrome("onur"));
        System.out.print("Abba");
        System.out.print(" ");
        System.out.println(IsPanlindrome2("abba"));
    }
}
