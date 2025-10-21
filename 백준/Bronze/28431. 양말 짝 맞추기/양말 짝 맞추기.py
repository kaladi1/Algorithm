so = []

for i in range(5) : 
    num = int(input())
    
    if num in so : 
        so.remove(num)
    else : 
        so.append(num)

print(so[0])