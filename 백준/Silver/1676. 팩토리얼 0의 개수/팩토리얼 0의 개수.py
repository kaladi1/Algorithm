n = int(input())

count = 0

for num in reversed(range(1, n + 1)):
    while num % 5 == 0:
        count += 1
        num = num // 5

print(count)