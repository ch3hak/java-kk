public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "chehak sharma";
        changename(name);
        System.out.println(name);
    }

    static void changename(String naam) {
        naam = "vegaa";
        int num = 10;
        int b = 20;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}