import sys
input = sys.stdin.readline

l = int(input())
lst = list(input().strip())
h = 0

for i, v in enumerate(lst):
    lst[i] = ord(v) - 96 

for i, v in enumerate(lst):
    h += v * (31 ** i)

print(h%1234567891)