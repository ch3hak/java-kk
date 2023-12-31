
    import java.util.Scanner;

    public class customerwealth {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of customers: ");
            int numCustomers = scanner.nextInt();

            System.out.print("Enter the number of accounts per customer: ");
            int numAccounts = scanner.nextInt();


            int[][] accounts = new int[numCustomers][numAccounts];
            System.out.println("Enter the wealth of each customer and account:");
            for (int i = 0; i < numCustomers; i++) {
                for (int j = 0; j < numAccounts; j++) {
                    accounts[i][j] = scanner.nextInt();
                }
            }

            int maxWealth = maximumWealth(accounts);

            System.out.println("Maximum Wealth: " + maxWealth);

        }

        public static int maximumWealth(int[][] accounts) {
            int max = Integer.MIN_VALUE;
            for (int person = 0; person < accounts.length; person++) {
                int sum = 0;
                for (int account = 0; account < accounts[person].length; account++) {
                    sum = sum + accounts[person][account];
                }
                if (sum > max)
                    max = sum;
            }
            return max;
        }
    }

