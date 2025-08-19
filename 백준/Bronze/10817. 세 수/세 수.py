import statistics  

value = list(map(int, input().split()))
 
value.sort() 
print(statistics.median(value))