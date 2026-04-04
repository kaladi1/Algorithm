import sys

n = int(input())
array = sorted(list(map(int, sys.stdin.readline().split())))	
x = int(input())

count = 0
left, right = 0, n-1	

while left < right:	
    sum = array[left] + array[right]
    if sum == x:	
        count += 1
        left += 1	
    elif sum > x:	
        right -= 1
    elif sum < x:
        left += 1
    
print(count)