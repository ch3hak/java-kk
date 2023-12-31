import java.util.Arrays;
import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        System.out.print("Enter elements for nums1: ");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }


        System.out.print("Enter size of nums2: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.print("Enter elements for nums2: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }


        merge(nums1, m, nums2, n);


        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }


        scanner.close();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);
    }
}
