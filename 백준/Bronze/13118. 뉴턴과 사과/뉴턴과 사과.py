human = list(map(int, input().split()))
x, y, r = map(int, input().split())

if x in human : 
    print(human.index(x) + 1)
else : 
    print(0)