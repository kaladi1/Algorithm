def reduce_pow(a, b, c):
    if (b == 1):
        return a % c

    X = reduce_pow(a, b//2, c)

    if (b % 2 == 0): # 짝수라면
        return X * X % c
    else: # 홀수라면
        return a * X * X % c

A, B, C = map(int, input().split())

print(reduce_pow(A, B, C))