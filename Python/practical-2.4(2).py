def listvalues():
    l=list()
    for i in range(1,31):
        l.append(i**2)
    print(l[:-25])
    print(l[25:])
listvalues()
