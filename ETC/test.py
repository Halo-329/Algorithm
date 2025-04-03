N=4

for k in range(0,N-1):
    for i in range(0,N-k-1):
        j=i+k+1
        print(f"({i},{j})", end=" ")
    print()
    
