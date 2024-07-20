import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ar1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String[] nStrings = in.nextLine().split(" ");
        int[] nums = new int[nStrings.length];

        // convert the numbers to ints
        for (int i = 0; i < nStrings.length; i++) {
            nums[i] = Integer.parseInt(nStrings[i]);
        }

        // handling inputs are done

        HashMap<Integer, Integer> table = new HashMap<>();

        // iterate the nums array to initialize the frequencies
        for (int num : nums) {
            table.put(num, 0);
        }

        // populate the frequencies of the nums
        for (int num : nums) {
            table.put(num, table.get(num) + 1);
        }

        int[][] frequencyArray = new int[table.size()][2];
        int index = 0;

        // print the dictionary table
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            frequencyArray[index][0] = entry.getKey();
            frequencyArray[index][1] = entry.getValue();
            index++;
        }

        Arrays.sort(frequencyArray, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                if (a[1] != b[1]) {
                    return Integer.compare(a[1], b[1]);
                } else {
                    return Integer.compare(a[0], b[0]);
                }
            }
        });

        for (int i = 0; i < frequencyArray.length; i++) {
            if (i == frequencyArray.length - 1) {
                System.out.print(frequencyArray[i][0]);
            } else {
                System.out.print(frequencyArray[i][0] + " ");
            }
        }

        in.close();
    }
}