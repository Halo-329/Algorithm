from collections import deque
import sys


list_=sys.stdin.readline()

bomb=sys.stdin.readline().strip()

 
stack=[]

for w in list_:
    stack.append(w)
    tword="".join(stack[-len(bomb):])
    if bomb==tword :
        for _ in range(len(bomb)):
            stack.pop()


if len(stack)==0:
    print("FRULA")
else:
    for i in stack:
        print(i,end="")



