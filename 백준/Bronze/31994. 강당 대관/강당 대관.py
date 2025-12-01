import sys
input = sys.stdin.readline

semi_list = []
for i in range(7) : 
    name, score = map(str, input().split())
    score = int(score)
    
    semi_list.append([name, score])

semi_list = sorted(semi_list, key = lambda x:x[1])

print(semi_list[-1][0])