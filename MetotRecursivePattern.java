import java.util.Scanner;

public class MetotRecursivePattern {
    static void pattern(int a){
        int i;
        int temp = a;
        System.out.print(temp);
        System.out.print(" ");
        for (i = a; i > 0; i-=5){
            temp -= 5;
            System.out.print(temp);
            System.out.print(" ");
            if (temp <= 0){
               for (int j = temp; j <= a-5; j+=5){
                   temp += 5;
                   System.out.print(temp);
                   System.out.print(" ");
               }
                }
            }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Bir sayı giriniz: ");
        num = scan.nextInt();
        pattern(num);
    }
}
