x = list(input("Enter a sequence of numbers with comma separated: ").split(","))
print(x)

if x[0] == x[len(x)-1]:
    print("true")
else:
    print("false")

#Another method to execute
firstEle = x[0]
lastEle = x[-1]
if firstEle == lastEle:
    print(True)
else:
    print(False)