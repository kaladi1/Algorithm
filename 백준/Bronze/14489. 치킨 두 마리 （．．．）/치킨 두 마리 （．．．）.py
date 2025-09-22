import sys

a,b=map(int,sys.stdin.readline().split())
c=2 * int(sys.stdin.readline())

if(a+b-c>=0):
    print(a+b-c)
else:
    print(a+b)