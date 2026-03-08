import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().rstrip().split())
queue = deque()
queue.append(n)
visited = [False for _ in range(100001)]
visited[n] = True

time = 0
done = False
while queue:
    size = len(queue)
    for _ in range(size):
        now = queue.popleft()
        if now == k: 
            done = True
            break

        if now > 0 and (not visited[now - 1]):
            visited[now - 1] = True
            queue.append(now - 1)
        if now < 100000 and (not visited[now + 1]):
            visited[now + 1] = True
            queue.append(now + 1)
        if now * 2 <= 100000 and (not visited[now * 2]):
            visited[now * 2] = True
            queue.append(now * 2)
    if done: break
    time += 1
print(time)