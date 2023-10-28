import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();

        switch (empid) {
            case 1:
                System.out.println("hiya");
                break;
            case 2:
                System.out.println("niya");
                break;
            case 3:
                switch (department) {
                    case "it":
                        System.out.println("it dept");
                        break;
                    case "management":
                        System.out.println("mngmnt dept");
                        break;
                    default:
                        System.out.println("mo dept");

                }
                break;
            default:
                System.out.println("correct empid?");

        }
    }
}