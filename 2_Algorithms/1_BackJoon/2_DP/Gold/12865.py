import sys

N, K = map(int, sys.stdin.readline().split())

item = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

dp = [[0] * (K + 1) for _ in range(N + 1)]


# N (1~N)
# K (1~K)

for i in range(1, N + 1):
    w, v = item[i - 1]
    for j in range(1, K + 1):
        if w > j:
            dp[i][j] = dp[i - 1][j]
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i-1][j-w]+v )
            
print(dp[N][K])
