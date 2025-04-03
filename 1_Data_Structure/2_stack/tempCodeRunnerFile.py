from collections import deque
import sys


list_=sys.stdin.readline()

bombs=sys.stdin.readline()


que=deque([])

for w in list_:
    if w not in bombs:
        que.append(w)
        



if len(que)==0:
    print("FRULA")
else:
    for w in que:
        print(w,end="")