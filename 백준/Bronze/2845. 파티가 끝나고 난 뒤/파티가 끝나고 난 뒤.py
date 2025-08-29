l,p=map(int,input().split())
arr=list(map(int,input().split()))

m=l*p

for i in arr:
    print(i-m,end=' ')