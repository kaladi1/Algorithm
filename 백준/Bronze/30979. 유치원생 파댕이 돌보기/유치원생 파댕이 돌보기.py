T = int(input())
N = int(input())
candy = list(map(int, input().split()))

if T <= sum(candy) :
    print('Padaeng_i Happy')
else : 
    print('Padaeng_i Cry')