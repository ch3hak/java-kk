import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }
    }
}