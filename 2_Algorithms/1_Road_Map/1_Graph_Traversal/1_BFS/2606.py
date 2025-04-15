import sys
from collections import deque

com_num = int(sys.stdin.readline())
edge_cnt = int(sys.stdin.readline())

graph = [[0] * (com_num + 1) for _ in range(com_num + 1)]
for _ in range(edge_cnt):
    x, y = map(int, sys.stdin.readline().split())
    graph[x][y] = 1
    graph[y][x] = 1
    

vst = [0] * (com_num + 1)

cnt=0
que=deque([])
def BFS(num):
    global cnt
    que.append(num)

    while que:
        n_com_num=que.popleft()    
        vst[n_com_num]=1
        cnt+=1
        for i in range(1,com_num+1):
            if graph[n_com_num][i] == 1 and vst[i]==0:
                que.append(i)
                
BFS(0)
print(cnt)
                

    
    