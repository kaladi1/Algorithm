import sys


n = int(sys.stdin.readline())
answer = 1001
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    if a <= b < answer:
        answer = b

print(-1 if answer == 1001 else answer)