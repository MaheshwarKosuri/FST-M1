nums = list(input("Enter a sequence of comma separated values: ").split(","))
print(nums)
s = 0

for num in nums:
    s += int(num)

print(s)