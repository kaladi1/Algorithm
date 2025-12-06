import sys
input = sys.stdin.readline

n = int(input())
S = input().rstrip()

result = ""

for i in S : 
    if i == "I" : 
        result += "i"
    else : 
        result += "L"

print(result)