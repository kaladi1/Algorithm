N, M = map(int, input().split())
sit = dict()
for _ in range(N):
    si, pa = map(str, input().split())
    sit[si] = pa
site = []
for _ in range(M):
    site.append(input())
for i in site:
    print(sit[i])