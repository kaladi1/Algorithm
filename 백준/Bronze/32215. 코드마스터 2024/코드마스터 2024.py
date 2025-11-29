import sys
input = sys.stdin.readline

N, M, K = map(int, input().split())

print((M*K) + M)