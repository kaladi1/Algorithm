input = __import__('sys').stdin.readline

n,d,k,c = map(int,input().split())
arr = []
for i in range(n):
    arr.append(int(input()))

for i in range(k-1): 	
    arr.append(arr[i])

s = 0 		
e = k-1 	
temp = 0 		
dict = {} 
maxs = 0

while s < n:
    if s == 0:
        for i in range(k):
            if arr[i] in dict:
                dict[arr[i]] += 1
            else:
                dict[arr[i]] = 1
    else:
        if dict[arr[s-1]] == 1:
            del dict[arr[s-1]]
        else:
            dict[arr[s-1]] -= 1

        if arr[e] in dict:
            dict[arr[e]] += 1
        else:
            dict[arr[e]] = 1

    if c in dict:
        temp = len(dict)
    else:
        temp = len(dict)+1

    maxs = max(maxs,temp)
    s+=1
    e+=1

print(maxs)