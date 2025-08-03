n = int(input())

a = b = c = 0

for i in range(1, n+1):
    a += i
    c += i*i*i
b = a*a

print(a)
print(b)
print(c)