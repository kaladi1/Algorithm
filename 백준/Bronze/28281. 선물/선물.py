N, X = map(int, input().split())

cost = list(map(int, input().split()))

minNum = 99999999999999999999
for i in range(0, len(cost)-1) : 
    tempNum = (cost[i] * X) + (cost[i+1] * X)
    
    minNum = min(minNum, tempNum)

print(minNum)