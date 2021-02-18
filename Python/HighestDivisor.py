def time24(s):
    if s[-2:] == "AM" and s[:2] == "12":
        return "00" + s[2:-2]
    elif s[-2:] == "AM":
        return s[:-2]
    elif s[-2:] == "PM" and s[:2] == "12":
        return s[:-2]
    else:
        return str(int(s[:2]) + 12) + s[2:5]
def minutes(s):
    return int(s[0:2]) * 60 + int(s[3:5])
for _ in range(int(input())):
    p1 = input()
    n = int(input())
    p2 = time24(p1)
    P = minutes(p2)
    ans = ""
    for i in range(n):
        l, t1, r, t2 = map(str, input().split())
        L = l + " " + t1
        R = r + " " + t2
        x = time24(L)
        y = time24(R)
        a = minutes(x)
        b = minutes(y)
        if a <= P and P <= b:
            ans += '1'
        else:
            ans += '0'
    print(ans)



# def highestDiv(n):
#     i = 1
#     ans = 0
#     while i <= n:
#         if n % i == 0:
#             if i > 10:
#                 break
#             ans = i
#         i = i + 1
#     return ans
# num = int(input())
# print(highestDiv(num))

# def maxFun(arr):
#     arr.sort(reverse=True)
#     ln = len(arr)
#     x = arr[0] - arr[ln-1]
#     y = arr[ln-2] - arr[ln-1]
#     z = arr[0] - arr[ln-2]
#     return (x+y+z)
#     # print(x, y, z)
# l = list(map(int, input().split()))
# print(maxFun(l))