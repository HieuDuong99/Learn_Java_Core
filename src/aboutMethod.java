import java.util.Scanner;

public class aboutMethod {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // trả về false
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // trả về false
            }
        }
        return true; // trả về true
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n = input.nextInt();
        boolean n2 = isPrime(n);
        System.out.println(n2);
    }
}















