public class p2 {
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
