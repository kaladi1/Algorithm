import sys

sum=0

while(1):
    n=int(sys.stdin.readline())

    if n<0:
        break
    else:
        sum=sum+n

print(sum)