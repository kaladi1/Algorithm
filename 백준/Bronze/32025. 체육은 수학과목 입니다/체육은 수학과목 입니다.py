import sys
import math
input = sys.stdin.readline

H = int(input())
W = int(input())

minNum = min(H, W)

print(math.floor((minNum / 2) * 100))