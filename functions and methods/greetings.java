import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = in.next();
        String personalised = myGreet("chehak sharma");
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "hello" + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}