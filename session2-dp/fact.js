// Tabulation
// const factorial = (n) => {
//     let dp = new Array(n).fill(0);
    
//     // define the base cases
//     dp[0] = 1;
//     dp[1] = 1;

//     for (let i = 2; i <= n + 1; i++){
//         dp[i] = dp[i - 1] * i;
//     }

//     // return dp[n]
//     return dp[n];
// }

// Recurrence Relation:
// F(n) = 1, for n=0,1
// F(n) = F(n-1) * n, for n>1

// // Recursion
// const factorial = (n) => {
//     if (n === 0 || n === 1) return 1;
//     return factorial(n - 1) * n;
// }

// console.log(factorial(5));

// Memoization
const factorial = (n, memo) => {
    if (n in memo) return memo[n];
    if (n === 0 || n === 1) return 1;
    memo[n] = factorial(n - 1, memo) * n;
    return memo[n];
}

const memo = {0: 1, 1: 1};
console.log(factorial(5, memo));
console.log(memo);