cnt, price = map(int, input().split(" "))

if 100 * cnt - price >= 0:
    print("Yes")
else:
    print("No")