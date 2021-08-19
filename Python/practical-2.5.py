l=[int(num)for num in input("enter the numbers of list:").split()]
for num in l:
    if num%2==0:
        l.remove(num)
print("Final List")
print(l)
