A=int(input())
int_A=A
sum=0

while True:
    a = A // 10
    b = A % 10
    c = (a + b) % 10
    A = int(str(b)+str(c))
    sum+=1
    if (int_A==A):
        break
print(sum)