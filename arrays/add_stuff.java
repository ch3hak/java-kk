import java.util.Scanner;

public class add_stuff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        System.out.println("Enter elements of the array (0 to " + (length - 1) + "):");
        int[] inpt = new int[length];
        for (int i = 0; i < length; i++) {
            inpt[i] = scanner.nextInt();
        }

        int[] ans = buildArray(inpt);

        System.out.println("array:");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    private static int[] buildArray(int[] nums) {
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = nums[nums[i]];
        }
        return resultArray;
    }
}
