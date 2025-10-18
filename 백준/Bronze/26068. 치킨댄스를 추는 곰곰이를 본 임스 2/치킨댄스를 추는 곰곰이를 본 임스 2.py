import sys

n=int(sys.stdin.readline())

count=0

for _ in range(n):

    num=input("")

    if 90 >= int(num[2:len(num)]):
        count=count+1

print(count)