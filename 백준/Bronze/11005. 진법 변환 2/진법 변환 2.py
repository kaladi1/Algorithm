if __name__ == '__main__':
    N, B = map(int, input().split())

    number = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    s = ''

    while N:
        s += number[N % B]
        N //= B

    print(s[::-1])