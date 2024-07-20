# Tabulation
# def factorial(n):
#     # build a table
#     dp = [0] * (n+1)

#     # define the base cases
#     dp[0] = 1  # edge test case
#     dp[1] = 1

#     # for the values >1 to n
#     for i in range(2, n+1):
#         dp[i] = dp[i-1] * i

#     return dp[n]

# Recurrence Relation:
# F(n) = 1, for n=0,1
# F(n) = F(n-1) * n, for n>1

# Memoization
def factorial(n, memo):
    # check if it is already in memo, if yes, return that value
    if n in memo:
        return memo[n]

    # if it is not in memo, compute the sub-problem and store it in memo
    if n == 0 or n == 1:
        return 1
    memo[n] = factorial(n-1, memo) * n

    return memo[n]


# get the time t1
memo = {}

print(factorial(1, memo))  # 5040
# print(memo)
# get the time t2
# return or print the difference t1-t2
