import sys
input = sys.stdin.readline

N = int(input())

sign = 0

for i in range(1, 10) : 
    if N % i == 0 and N // i <= 9 : 
        sign = 1
        break

if sign == 0 : 
    print('0')
else : 
    print('1')