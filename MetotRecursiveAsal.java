import java.util.Scanner;

public class MetotRecursiveAsal {
    static boolean isPrime(int a) {
        int count = 0;
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            num = scan.nextInt();

            if (isPrime(num)){
                System.out.println("Sayı asaldır.");

            }else{
                System.out.println("Sayı asal değildir.");

            }
        }while (num !=0 );
        if (num == 0){
            System.out.println("Hata!");
        }


    }
}
