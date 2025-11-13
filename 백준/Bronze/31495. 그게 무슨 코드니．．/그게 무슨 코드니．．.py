import sys
input = sys.stdin.readline

S = input().rstrip()

if S[0] == "\"" and S[-1] == "\"" and len(S) > 2 : 
    print(S[1:-1])
else : 
    print("CE")