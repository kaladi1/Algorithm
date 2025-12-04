import sys
input = sys.stdin.readline

N, A, B = map(int ,input().split())

p = 1
q = 1

for _ in range(N) : 
    p += A
    q += B
    
    if p < q : 
        p, q = q, p
    
    if p == q : 
        q -= 1

print(p, q)