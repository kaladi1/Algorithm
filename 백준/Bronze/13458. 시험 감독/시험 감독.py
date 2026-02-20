import sys
input = sys.stdin.readline

test = int(input())      
students = list(map(int, input().split()))    
main_sup, sub_sup = map(int, input().split())
total = 0              
idx = 0                

for arg in students:
    if arg <= main_sup:
        total += 1
        continue
    students[idx] = arg - main_sup 
    if (students[idx] % sub_sup) != 0:
        total += ((students[idx] // sub_sup) + 2)
    else:
        total += (students[idx] // sub_sup + 1)
    idx += 1

print(total)