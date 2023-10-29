import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int ans = sum2();

        int ans = sum3(20, 30);

    }

    static int sum3(int a, int b) {
        int sum = a = b;
        return sum;
    }
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}