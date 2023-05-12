public class MetotFibonacci {

    static int fibo(int elemanSayisi){

        int total = 0;
        int num1 = 0, num2 = 1;

        for (int i = 1; i < elemanSayisi; i++){
            System.out.print(num1 + " ");

            total = num1 + num2;
            num1 = num2;
            num2 = total;
        }
        return num1;
    }
    public static void main(String[] args) {

        System.out.println(fibo(11));



    }
}
