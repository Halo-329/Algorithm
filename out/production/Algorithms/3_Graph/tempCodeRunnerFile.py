""" https://www.acmicpc.net/problem/24479"""

import sys

N,M,R=map(int,sys.stdin.readline().split())

vst=[False]*(N+1)

links=[[] for _ in range(N+1)]
result=[]

def dfs(R):
    vst[R]=True
    result.append(R)
    links[R].sort()
    for i in links[R]:
        if vst[i]==False:
            dfs(i)
                        
for _ in range(N):
    x,y=map(int,sys.stdin.readline().split())
    links[x].append(y)
    links[y].append(x)
    

dfs(R)
for i in range(1,N+1):
    try:
        print(result.index(i)+1)
    except ValueError:
        print(0) 