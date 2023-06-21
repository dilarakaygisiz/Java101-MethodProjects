import java.util.Scanner;

public class MetotRecursiveUslu {
    
    static int uslu(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *=a;
        }
        System.out.print("Sonuç: ");
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taban, us;
        while (true) {
            System.out.print("Taban değeri giriniz: ");
            taban = scan.nextInt();
            System.out.print("Üs değerini giriiz: ");
            us = scan.nextInt();

            System.out.println(uslu(taban, us));
        }
    }
}
