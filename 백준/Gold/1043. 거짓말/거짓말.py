import sys

parent = [i for i in range(51)]
truth_check = [False for _ in range(51)]


def find(a):
    if parent[a] == a:
        return a
    else:
        parent[a] = find(parent[a])
        return parent[a]


def uni(a, b):
    aRoot = find(a)
    bRoot = find(b)
    if aRoot == bRoot:
        return
    if truth_check[aRoot]:
        parent[bRoot] = aRoot
        return

    parent[aRoot] = bRoot


N, M = map(int, sys.stdin.readline().split())
truth_people = list(map(int, sys.stdin.readline().split()))
people_list = []

if truth_people[0] != 0:
    for i in range(1, truth_people[0] + 1):
        truth_check[truth_people[i]] = True

for _ in range(M):
    people = list(map(int, sys.stdin.readline().split()))
    people_list.append(people[1:])
    prev = people[1]

    for i in range(1, people[0] + 1):
        uni(prev, people[i])
        prev = people[i]

answer = 0

for peo in people_list:
    truth_flag = False
    for pe in peo:
        if truth_check[find(pe)]:
            truth_flag = True
    if not truth_flag:
        answer += 1

print(answer)