# def findMaxProfit(prices, N):
#     # Kumar needs to find the minimum price in which
#     # the stock needs to be bought
#     # and the maximum price on a day in which he sells the stock

#     # assume a maximum value in the minPrice, so that any price that is compared to this would be the minimum price value
#     minPrice = 2**63
#     maxProfit = 0

#     # iterate through the prices of stocks
#     # and for each of the price, update our minPrice
#     for price in prices:
#         if price < minPrice:
#             minPrice = price

#         # store the profit
#         profit = price - minPrice

#         # check if the current profit is more than maxProfit
#         if profit > maxProfit:
#             maxProfit = profit

#     # return the max profit.
#     return maxProfit


# # input handling
# N = int(input())
# prices = input().split()
# prices = list(map(int, prices))

# print(findMaxProfit(prices, N))


def findMaxProfit(prices, N):

    minPrice = prices[0]
    dp = [0] * N

    for i in range(1, N):
        minPrice = min(minPrice, prices[i])
        dp[i] = max(dp[i-1], prices[i] - minPrice)

    return dp[N-1]


# input handling
N = int(input())
prices = input().split()
prices = list(map(int, prices))

print(findMaxProfit(prices, N))
