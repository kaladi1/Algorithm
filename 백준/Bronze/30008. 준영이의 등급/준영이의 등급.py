N, K = map(int, input().split())

scoreList = list(map(int ,input().split()))
resultList = []

for score in scoreList : 
    score *= 100
    
    score = score // N
    
    if score >= 0 and score <= 4 : 
        resultList.append(1)
    elif score > 4 and score <= 11 : 
        resultList.append(2)
    elif score >= 11 and score <= 23 : 
        resultList.append(3)
    elif score >= 23 and score <= 40 : 
        resultList.append(4)
    elif score >= 40 and score <= 60 : 
        resultList.append(5)
    elif score >= 60 and score <= 77 : 
        resultList.append(6)
    elif score >= 77 and score <= 89 : 
        resultList.append(7)
    elif score >= 89 and score <= 96 : 
        resultList.append(8)
    elif score >= 96 and score <= 100 : 
        resultList.append(9)

for i in resultList : 
    print(i, end= " ")