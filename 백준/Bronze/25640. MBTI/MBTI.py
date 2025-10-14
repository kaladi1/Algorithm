import sys

mbti = input("")
n = int(sys.stdin.readline())

count = 0

for _ in range(n):
    ch = input("")

    if mbti == ch:
        count=count+1

print(count)