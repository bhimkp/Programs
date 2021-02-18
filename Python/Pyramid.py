# def my_func(x):
#   y, z = x, 0
#   while x > 0:
#     t = x % 10
#     x //= 10
#     z = z*10 + t 
#   return z

# nums = 101
# if __name__ == "__main__":  
#   result = my_func(nums)
#   print(result)

# def func(x = 1, y = 2):
#   return x + y, x - y

# x, y = func(y = 2, x = 1)
# print(x, y)

# num1 = 0
# def out_func():
#   num1 = 1
#   def in_func():
#     nonlocal num1
#     num1 = 2

#   in_func()
#   return num1

# num2 = out_func()
# print(num1, num2)

# x=12
# def f1(a,b=x):
#   print(a,b)
# x=15
# f1(4)


# list1 = [1,2,3]
# list2 = list1
# list3 = [1,2,3]
# print(list1 == list3)
# print(list1 is list3)
# print(list1 == list2)
# print(list1 is list2)

# def oddsums(n):
#   total=0
#   result=[]
#   for i in range(1,n+1):
#     odd= 2*i-1
#     total=total+odd
#     result.append(total)
#   return result
# print(oddsums(5))

# x = "abcdef"
# i = "a"
# while i in x:
#   x = x[1:]
#   print(i, end = " ")

# def my_func(num):
#   data = [0]
#   for i in range(1, num+1):
#     data.append(data[i >> 1] + int(i & 1))
#   return data
# num = 6
# print(my_func(num))


# def my_func(s, z):
#   total = 0
#   len_str = len(s)

#   for x, y in z:
#     if x == 0:
#       total += y
#     else:
#       total -= y
#   total = total % len_str
#   print(s[total:] + s[:total])


# s = 'cutshort'
# z = [[0, 3], [1, 11]]

# if __name__ == "__main__":
#   my_func(s, z)


l = [1,2,3,4,5]
for i in range()