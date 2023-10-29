import javax.swing.*;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
//        fun();
//        multiple(2, 3, "vegaa", "chehak", "anay");
        demo(2, 3, 4);
    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v ) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}