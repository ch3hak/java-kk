import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer x: ");
        int x = scanner.nextInt();

        int result = mySqrt(x);

        System.out.println("Square root of " + x + " rounded down: " + result);

    }

    public static int mySqrt(int x) {
        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
    }
}
