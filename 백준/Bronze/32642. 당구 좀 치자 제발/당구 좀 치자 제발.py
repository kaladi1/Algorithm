import sys
input = sys.stdin.readline

N = int(input())

weather_list = list(map(int, input().split()))

result = 0
angry = 0

for weather in weather_list:
    if weather == 1:
        angry += 1
    else:
        angry -= 1
    
    result += angry

print(result)