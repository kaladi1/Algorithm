import sys
input = sys.stdin.readline

n, m = map(int, input().split())

for _ in range(n) :
    x = list(map(str, input().strip()))
    x.reverse()

    for i in range(m) :
        print(x[i], end="")

    print()