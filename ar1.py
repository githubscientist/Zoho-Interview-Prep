'''
You are given an array. Your task is to sort the array in given manner. Print the elements in increasing order of the frequency. If frequency is same print smaller one first.


Input Description:
You are given a number ‘n’. Then in next line n space separated numbers.

Output Description:
Print the array as mentioned

Sample Input :
4
1 1 3 2
Sample Output :
2 3 1

'''


def second(a):
    return a[1]


# handle the inputs
n = int(input())

numbers = list(map(int, input().split()))

# generating the frequencies
table = {}

# initialize the frequencies with 0 by creating the unique values from the array to be the keys
for number in numbers:
    table[number] = 0

# populate with the actual frequencies
for number in numbers:
    table[number] += 1

# sort the numbers based on the frequencies and
# if the frequencies are same, we need to sort them based on values
result = sorted(table.items())

result = sorted(result, key=second)

result = [str(x[0]) for x in result]

print(' '.join(result))
