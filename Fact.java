// Tabulation
// public class Fact {
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }

//     static int factorial(int n) {
//         int dp[] = new int[n + 1];

//         for (int i = 0; i <= n; i++) {
//             dp[i] = 0;
//         }

//         dp[0] = 1;
//         dp[1] = 1;

//         // for all the values from 2 to n
//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] * i;
//         }

//         return dp[n];
//     }
// }

// Recursion
// public class Fact {
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }

//     static int factorial(int n) {
//         if (n == 0 || n == 1)
//             return 1;
//         return factorial(n - 1) * n;
//     }
// }

// Memoization

import java.util.HashMap;

public class Fact {
    public static void main(String[] args) {
        // create a hashMap to memoize the factorials
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

        System.out.println(factorial(5, memo));
    }

    static int factorial(int n, HashMap<Integer, Integer> memo) {
        // check if the memo has the factorial already
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0 || n == 1)
            return 1;
        // make an entry into memo
        memo.put(n, factorial(n - 1, memo) * n);
        return memo.get(n);
    }
}