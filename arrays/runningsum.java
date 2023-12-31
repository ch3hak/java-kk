import java.util.Scanner;

public class runningsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = runningSum(nums);


        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];

        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        return sum;
    }
}
