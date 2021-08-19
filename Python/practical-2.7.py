Date={"keertan":"11-09-2001","ram":"13-06-2001","rocky":"04-12-1992"}
str=input("Persons name whose birthday to find:")
l=str.split()
birth=""
for i in l:
    if i in Date.keys():
        name=i
print("".join([name," Date of Birth :",Date[name]]))
