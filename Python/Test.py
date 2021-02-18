for _ in range(int(input())):
    n = int(input())
    arr = [int(x) for x in input().split()]
    c0 = c1 = c2 = r = 0
    for ele in arr:
        if ele % 3 == 0:
            c0 += 1
        elif ele % 3 == 1:
            c1 += 1
        else:
            c2 += 1
    if c0 == c1 and c1 == c2:
        print(0)
    elif (abs(c0-c1) == 1 and abs(c1-c2) == 1) or (abs(c0-c2) == 1 and abs(c2-c1) == 1):
        print(1)
    else:
        print(max(c0,c1,c2) - min(c0,c1,c2))

