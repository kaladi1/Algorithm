n = int(input())
print(sum(map(lambda x: int(x) if int(x) <= n else n, input().split())))