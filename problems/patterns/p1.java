public class p1 {
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
