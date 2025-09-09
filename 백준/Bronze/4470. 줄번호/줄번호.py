import sys

input = sys.stdin.readline

N = int(input().rstrip())

for i in range(1, N + 1):
  str = input().rstrip()
  print(f'{i}. {str}')