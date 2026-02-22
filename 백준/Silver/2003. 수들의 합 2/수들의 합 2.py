import sys
input = sys.stdin.readline

N, M = map(int, input().split())
A = list(map(int, input().split()))
cnt = 0
tot = A[0]          
left, right = 0, 1 

while True:
    if tot < M:         
        if right == N: 
            break     
        tot += A[right]
        right += 1     
    elif tot == M:      
        cnt += 1        
        tot -= A[left]  
        left += 1       
    else:               
        tot -= A[left]  
        left += 1     

print(cnt)