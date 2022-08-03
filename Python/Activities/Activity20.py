import pandas

data = pandas.read_excel("sample.xlsx")

print(data)

print("No of rows and columns are ", data.shape)

print("emails are ", data['Email'])

print("sorted values are ", data.sort_values('FirstName'))
