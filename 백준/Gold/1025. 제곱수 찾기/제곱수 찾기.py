N, M = map(int, input().split())
numbers = []

for _ in range(N):
    a = list(input())

    numbers.append(a)
answer = -1

for i in range(N):
    for j in range(M):

        for col in range(-N, N):
            for row in range(-M, M):
                x, y = i, j
                result = ""

                if col == 0 and row == 0:
                    continue
                
                while 0 <= x < N and 0 <= y < M:
                    result += numbers[x][y]
                    x += col
                    y += row
                    if int(result) == int((int(result) ** 0.5)) ** 2:
                        answer = max(answer, int(result))
                
print(answer)