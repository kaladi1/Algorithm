c = int(input())

for _ in range(c):
    scores = list(map(int, input().split()))
    average = sum(scores[1:]) / scores[0]
    cnt = 0
    for i in scores[1:]:
        if i > average:
            cnt += 1
    answer = cnt/scores[0]*100
    print('%.3f' %answer + '%')