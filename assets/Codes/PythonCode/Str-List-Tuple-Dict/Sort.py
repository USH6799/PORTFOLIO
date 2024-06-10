print("Welcome to the Bubble Sort")
print()
numbers = []
while(True):
        num = input("Enter The number or q to sort: ")
        try:
            num = int(num)
            numbers.append(num)
        except:
              if(num == "q"):
                print("You Want to sort It in Ascending order Or descending Order")
                option = input("enter a For Ascending Order\nEnter z For Descending Order: ")
                if(option == "a"):
                  numbers.sort(reverse = False)
                  print(numbers)
                  break
                if(option == "z"):
                  numbers.sort(reverse = True)
                  print(numbers)
                  break
                else:
                   print("Wrong input")
                   continue
              else:
                   print("Wrong Input")
                   continue