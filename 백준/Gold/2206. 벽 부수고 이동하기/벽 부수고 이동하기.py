import sys
from collections import deque
input = sys.stdin.readline
N, M = map(int, input().split())
graph = [list(map(int, input().rstrip())) for _ in range(N)]


move = [[[0, 0] for _ in range(M)] for _ in range(N)]

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]


def BFS(x, y):
    queue = deque([(x, y, 0)])
    move[y][x][0] = 1

    while queue:
        x, y, break_cnt = queue.popleft()

        if (x, y) == (M-1, N-1):
            return move[y][x][break_cnt]

        for i in range(4):
            next_x, next_y = x+dx[i], y+dy[i]
            if 0 <= next_x < M and 0 <= next_y < N:

                if graph[next_y][next_x] == 1 and break_cnt == 0:
                    move[next_y][next_x][1] = move[y][x][0] + 1
                    queue.append([next_x, next_y, 1])

                if graph[next_y][next_x] == 0 and move[next_y][next_x][break_cnt] == 0:
                    move[next_y][next_x][break_cnt] = move[y][x][break_cnt] + 1
                    queue.append([next_x, next_y, break_cnt])
    return -1


print(BFS(0, 0))