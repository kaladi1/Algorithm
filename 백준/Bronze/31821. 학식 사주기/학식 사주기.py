import sys
input = sys.stdin.readline

N = int(input())

cost_list = []

for i in range(N) : 
    cost_list.append(int(input()))

M = int(input())

total_sum = 0

for i in range(M) : 
    total_sum += cost_list[int(input()) - 1]

print(total_sum)