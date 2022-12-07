package ss2_loop_java;

public class PrimbNumb1 {
    public static void main(String[] args) {
        int primeNumb = 1;
        int countPrimes = 0;
        System.out.println("Các số nguyên tố lần lượt là: ");
        while (countPrimes < 20) {
            int count = 0;
            for (int i=1; i<=primeNumb; i++) {
                if (primeNumb%i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(primeNumb);
                countPrimes++;
            }
            primeNumb++;
        }
    }
}
