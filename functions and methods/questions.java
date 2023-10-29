import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(isPrime(n));
//        System.out.println(isarmstrong());
        for (int i = 100; i < 1000; i++) {
            if (isarmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isarmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        if (sum == original) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c =  2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}