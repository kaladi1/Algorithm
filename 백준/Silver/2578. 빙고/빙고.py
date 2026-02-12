import sys
 
def count_bingo(visited):
    bingo_count = 0
 
    for row in visited:
        if all(row):
            bingo_count += 1
 
    for col in range(5):
        if all(visited[row][col] for row in range(5)):
            bingo_count += 1
 
    if all(visited[i][i] for i in range(5)):
        bingo_count += 1
 
    if all(visited[i][4 - i] for i in range(5)):
        bingo_count += 1
 
    return bingo_count
 
bingo = {}
 
visited = [[False]*5 for _ in range(5)]
 
data = list(map(int, sys.stdin.read().split()))
 
board_nums = data[:25]
 
call_nums = data[25:]
 
for idx, num in enumerate(board_nums):
    bingo[num] = (idx // 5, idx % 5)
 
for idx, num in enumerate(call_nums):
    x, y = bingo.get(num)
    visited[x][y] = True
 
    if count_bingo(visited) >= 3:
        print(idx + 1)
        break