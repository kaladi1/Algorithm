import sys

N = int(input())
switchs = [-1] + [int(x) for x in sys.stdin.readline().rstrip().split()]
students = int(input())

def click(x):
    if switchs[x] == 1:
        switchs[x] = 0
    else:
        switchs[x] = 1

for _ in range(students):
    commands = [int(x) for x in sys.stdin.readline().rstrip().split()]
    gender, num = commands[0], commands[1]

    if gender == 1: # 남자면
        for i in range(num, N + 1, num):
            click(i)
    else:
        click(num)
        for k in range(N // 2):
            if num + k > N or num - k < 1:
                break
            if switchs[num + k] == switchs[num - k]:
                click(num - k)
                click(num + k)
            else:
                break

sliced_lists = [switchs[i:i+20] for i in range(1, len(switchs), 20)]

for s in sliced_lists:
    print(" ".join(map(str, s)))