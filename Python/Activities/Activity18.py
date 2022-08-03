import pandas

dataframe = pandas.read_csv("activity17_csv.csv")

print("Full Data is ")
print(dataframe)

print("...................")
print(dataframe["Usernames"])


print("...................")
print(dataframe["Usernames"][1], dataframe["Passwords"][1])


print("...................")
print("Usernames sorted is ")
print(dataframe.sort_values("Usernames"))

print("Usernames sorted in descending order is ")
print(dataframe.sort_values("Usernames", ascending=False))


print("...................")
print("Passwords sorted is ")
print(dataframe.sort_values("Passwords"))

print("Passwords sorted in descending order is ")
print(dataframe.sort_values("Passwords", ascending=False))
