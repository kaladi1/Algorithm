n = int(input())
graph=[]
for _ in range(n):
  graph.append(list(map(int,input().split())))

step=[[0,0],[0,1],[1,0],[1,1]]
result = [0,0]

def func(n,x,y):
  if n==1:
    result[graph[x][y]]+=1
    return
  
  flag=True
  v = graph[x][y]
  for i in range(n):
    t=graph[x+i][y:y+n]
    if not (len(set(t))==1 and v in t) :
      flag = False
      break

  if flag:
    result[v]+=1
    return

  temp=n//2
  for i in step:
    func(temp,x+i[0]*temp,y+i[1]*temp)

func(n,0,0)
for i in result:
  print(i)
