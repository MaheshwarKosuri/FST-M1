def fibb(num):
    if num<=1:
        return num
    else:
        return (fibb(num-1) + fibb(num-2))

x = int(input("Enter the no to which Fibonacci series to be generated: "))

if x<=0:
    print("Enter a number that is greater than 0")
else:
    print("Fibonacci series is :")
    for i in range(x):
        print(fibb(i))


