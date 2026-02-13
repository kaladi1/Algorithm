from collections import deque

row, column, k = map(int,input().split())
matrix = [[1 for _ in range(column)] for _ in range(row)]

for _ in range(k):
    lx,ly,rx,ry = map(int,input().split())

    for i in range(lx,rx):
        for j in range(ly,ry):
            matrix[j][i] = 0

lst = []
visited = [[False for _ in range(column)] for _ in range(row)]

dx = [1,-1,0,0]
dy = [0,0,1,-1]

for i in range(row):
    for j in range(column):

        if not visited[i][j] and matrix[i][j] == 1:
            q = deque()
            q.append((i,j))
            visited[i][j] = True
            value = 1

            while q:
                x,y = q.popleft()

                for d in range(4):
                    nx,ny = x+dx[d], y+dy[d]

                    if 0<=nx<row and 0<=ny<column and not visited[nx][ny] and matrix[nx][ny] == 1:
                        visited[nx][ny] = True
                        value += 1
                        q.append((nx,ny))
            lst.append(value)

lst.sort()
print(len(lst))
for i in lst:
    print(i,end = " ")