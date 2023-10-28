import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "apple" -> System.out.println("sweet red fruit");
            case "orange" -> System.out.println("roudn fruit");
            default -> System.out.println("enter a valid fruit");
        }

        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");

        }

        int empNo = in.nextInt();

    }
}