for _ in range(int(input())):
    s = input()
    ans = []
    n = len(s)
    for i in range(n):
        if i % 2 == 0:
            if ord(s[i]) > 97:
                ans.append('a')
            else:
                ans.append('b')
        else:
            if ord(s[i]) < 122:
                ans.append('z')
            else:
                ans.append('y')
    print("".join(ans)) 
             