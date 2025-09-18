for i in range(3):
    a, b, c, d, e, f = map(int, input().split())
    n = (d * 3600 + e * 60 + f) - (a * 3600 + b * 60 + c)
    print((n // 3600), (n % 3600) // 60, (n % 3600) % 60)