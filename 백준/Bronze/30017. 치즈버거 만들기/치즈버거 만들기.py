import sys
input = sys.stdin.readline

a, b = map(int, input().split())
answer = 0

if a == b+1:
    answer = a + b
elif a > b+1:
    answer = (b+1) + b
elif a < b+1:
    answer = a + (a-1)

print(answer)