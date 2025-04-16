import sys


# DFS -> 시간초과과
N,M=map(int,sys.stdin.readline().split())

mat = [list(map(int, list(sys.stdin.readline().strip()))) for _ in range(N)]

# # mat = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

# result=[]


# vst=[[False]*M for _ in range(N)]

# def dfs(x,y,cnt):
#     if x==N-1 and y ==M-1:
#         result.append(cnt)
#         return
    
#     vst[x][y]=True
    
#     if x+1>=0 and y>=0 and x+1<N and y<M and mat[x+1][y]==1 and vst[x+1][y]==False:
#         dfs(x+1,y,cnt+1)
#     if x>=0 and y+1>=0 and x<N and y+1<M and mat[x][y+1]==1 and vst[x][y+1]==False:
#         dfs(x,y+1,cnt+1)  
#     if x-1>=0 and y>=0 and x-1<N and y<M and mat[x-1][y]==1 and vst[x-1][y]==False:
#         dfs(x-1,y,cnt+1) 
#     if x>=0 and y-1>=0 and x<N and y-1<M and mat[x][y-1]==1 and vst[x][y-1]==False:
#         dfs(x,y-1,cnt+1) 

#     vst[x][y]=False

# dfs(0,0,1)
# print(min(result))


