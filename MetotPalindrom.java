import java.util.Scanner;

public class MetotPalindrom {

    static boolean isPalindrom(int n){
        int temp = n;      //n yerine geçici sayı atama.
        int reversed = 0;
        int lastNum;
        while (temp != 0){
            lastNum = temp % 10;   //n sayısının son rakamını bulma..
            reversed = (reversed*10) + lastNum;
            temp = temp / 10;     // ex: 5885 => 588 => 58 ..
        }
        System.out.println("Number => " + n);
        System.out.println("Reversed number => " + reversed);
        if (reversed == n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(5885));
    }
}
