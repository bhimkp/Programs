def first(n):
    k=2*n-2
    for i in range(0,n):
        for j in range(0,k):
            k=k-1
            print(end=' ')
        for j in range(0,i+1):
            print("*",end=" ")
        print()
def second(n):
    k=0
    for i in range(0,n):
        for j in range(0,2*n-2):
            k=k+1
            print(end=' ')
        for j in range(0,i+1):
            print("*",end=" ")
        print()
def steam(m):
    k=11
    for i in range(0,5):
        for j in range(0,k):
            print(end=" ")
        for j in range(0,3):
            print("*",end=" ")
        print()
first(7)
second(7)
steam(3)