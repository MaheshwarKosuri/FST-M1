list1 = [2,4,6,1,9]
list2 = [7,8,3,5]
list3 = []
for x in list1:
    if x%2!=0:
        list3.append(x)
print(list3)
for y in list2:
    if y%2==0:
        list3.append(y)
print(list3)