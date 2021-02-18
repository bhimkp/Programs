


# for _ in range(int(input())):
#     a, b = [int(x) for x in input().split()]
#     count = 0
#     while(a // b) != 0:
#         a = a // b
#         b = b + 1
#         count += 1
#     print(a,b)
#     print(count)

# def findPairs(arr,v):
#     find_val = set()
#     for ele in arr:
#         if v - ele in find_val:
#             print(ele, v-ele)
#             return True
#         find_val.add(ele)
#     return False

# arr = [5,7,1,2,8,4,3]
# v = 10
# print(findPairs(arr,v))