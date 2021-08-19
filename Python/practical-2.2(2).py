list1=[int(item) for item in input("Enter the numbers:").split()]
def shift(list):
    list1=[]
    for i in list:
        list1.insert(len(list1)-1,i)
    return list1
print(shift(list1))
