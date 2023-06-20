import java.util.Scanner;

public class GelismisHesapMakinesi {


    static int topla(int a, int b){
        int result = a + b ;
        System.out.print("Sonuç: ");
        return result;
    }
    static int cikar(int a, int b){
        int result = a - b ;
        System.out.print("Sonuç: ");
        return result;
    }
    static int carp(int a, int b){
      int result = a * b;
        System.out.print("Sonuç: ");
        return result;
    }
    static int bol(int a, int b){
        if (b == 0){
            return 0;
        }
        int result = a / b ;
        return result;
    }
    static int uslu(int a, int b){
        int result = 1 ;
        int i;
        for (i = 1; i <= b;i++){
            result *= a;
        }
        System.out.print("Sonuç: ");
        return result;
    }
    static int faktoriyel(int a){
        int result = 1;
        for (int i = 1; i<a; i++){
            result += result*i;
        }
        System.out.print("Sonuç: ");
        return result;
    }
    static int mod(int a, int b){
        int result = a % b ;
        System.out.print("Sonuç: ");
        return result;
    }
    static void dikdortgenAlanCevre(int a, int b){
        System.out.println("Çevre: " + (a+b)*2);
        System.out.println("Alan: " + (a*b));
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1-Toplama İşlemi\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üslü İşlemi\n"
                + "6-Faktöriyel İşlemi\n"
                + "7-Mod İşlemi\n"
                + "8-Dikdörtgen Alan-Çevre İşlemi\n"
                + "0-Çıkış Yap\n";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("Birinci sayıyı giriniz: ");
            int a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = scan.nextInt();

            switch (select) {

                case 1:
                    System.out.println(topla(a, b));
                    break;
                case 2:
                    System.out.println(cikar(a, b));
                    break;
                case 3:
                    System.out.println(carp(a, b));
                    break;
                case 4:
                    if (bol(a, b) == 0){
                        System.out.println("İkinci sayı sıfırdan farklı olmalı!");
                    }
                    else {
                        System.out.println("Sonuç: " + bol(a, b));
                    }
                    break;
                case 5:
                    System.out.println(uslu(a, b));
                    break;
                case 6:
                    System.out.println(faktoriyel(a));
                    break;
                case 7:
                    System.out.println(mod(a, b));
                    break;
                case 8:
                    dikdortgenAlanCevre(a, b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem!");


            }


        }
        System.out.println("Güle güle!");

    }
}
