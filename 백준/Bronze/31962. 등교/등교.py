import sys
input = sys.stdin.readline

N, X = map(int, input().split())

S_list = []

for i in range(N) : 
    S, T = map(int, input().split())
    
    if (S + T) <= X :  
        S_list.append(S)
    
if len(S_list) == 0 : 
    print(-1)
else : 
    print(sorted(S_list)[-1])