p1 = input("Enter player1 name: ")
p2 = input("Enter player2 name: ")

while True:
    ch1 = input("Enter "+p1+"'s choice: ").lower()
    ch2 = input("Enter "+p2+"'s choice: ").lower()

    if ch1 == ch2:
        print("Both entered same choice. Please select different choices")
    elif ch1 == 'rock':
        if ch2 == 'scissors':
            print(p1 + " won the game as "+ch1+" beats "+ch2)
        else:
            print(p2 + " won the game as "+ch2+" beats "+ch1)
    elif ch1 == 'paper':
        if ch2 == 'scissors':
            print(p2 + " won the game as "+ch2+" beats "+ch1)
        else:
            print(p1 + " won the game as "+ch1+" beats "+ch2)
    elif ch1 == 'scissors':
        if ch2 == 'rock':
            print(p2 + " won the game as "+ch2+" beats "+ch1)
        else:
            print(p1 + " won the game as "+ch1+" beats "+ch2)
    else:
        print("Invalid entry")
    repeat = input("Do you want to play another round: Type yes/no: ").lower()
    if repeat == 'yes':
        pass
    elif repeat == 'no':
        raise SystemExit
    else:
        print("You entered invalid option. Exiting now..")
        raise SystemExit