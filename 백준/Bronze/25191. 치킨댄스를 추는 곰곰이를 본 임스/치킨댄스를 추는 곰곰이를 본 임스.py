n = int(input())
coke, beer = map(int, input().split())
coke /= 2
chicken = coke + beer
if chicken > n:
    chicken = n
print("%d" % chicken)