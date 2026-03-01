import sys
input = sys.stdin.readline
n = int(input())
for i in range(n-1,-1,-1):
    print(('*'*(i*2+1)).rjust(i+n))