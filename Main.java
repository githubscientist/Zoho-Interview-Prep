import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int prices[] = new int[N];
        in.nextLine();
        String line = in.nextLine();
        String numbers[] = line.split(" ");
        int nums[] = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        int minPrice = 1 << 16;
        int maxProfit = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] < minPrice)
                minPrice = nums[i];
            if ((nums[i] - minPrice) > maxProfit) {
                maxProfit = nums[i] - minPrice;
            }
        }

        System.out.print(maxProfit);
    }
}
