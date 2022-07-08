def sum(n):
    if n:
        return n + sum(n-1)
    else:
        return 0


x = sum(5)
print(x)