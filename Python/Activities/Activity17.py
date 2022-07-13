import pandas as pd

data = {
    "Usernames":["admin","Charles","Deku"],
    "Passwords":["password","Charl13","AllMight"]
}

dataframe = pd.DataFrame(data)

print(dataframe)

"""
to print the 
dataframe
into an csv file
"""

dataframe.to_csv("activity17_csv.csv")


