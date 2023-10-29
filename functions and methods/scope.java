import java.util.Enumeration;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "vegaa";

        {
                a = 100;
                int c = 78;
                name = "chehak";

            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);


        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 10;
        }
        System.out.println(i);
    }

    static void random(int marks) {
        int num = 89;
        System.out.println(num);
        System.out.println(marks);

    }
}