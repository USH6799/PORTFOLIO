class Library: # a class with 3 methods , name of the class is 'Library'
    
    def __init__(self): # the constructor of the class taking no arguments

        self.nBooks = 0 # A variable to store number of books in the library
        
        self.Books = [] # A list to store names of the books
       
       
        
    def AddBook(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class, used to add a book in the library
        
        self.Books.append(input("Enter the name of the book: ")) # appending the name of the book in the list
        
        self.nBooks = len(self.Books) # updating the value of variable 'nBooks'
        
        print("\nBook added successfully\n")
        
        
        
    def ShowInfo(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class, used to show the information of the library
        
        print("Total number of books: ",self.nBooks , "in the library") # printing the value of variable 'nBooks'
        
        for book in self.Books: # iterating through the list 'Books'

            print(self.Books.index(book) + 1 ,". Name of the book is: " , book) # printing the value of variable 'Books'
            
            
            
    def RemoveBook(self): # a method fnc taking 1 parameter 'self' which refers to the object of the class, used to remove a book from the library
        
        self.Books.remove(self.Books[int(input("Enter the Number of the book(Written before the book name): "))]) # removing the name of the book from the list
        
        self.nBooks = len(self.Books) # updating the value of variable 'nBooks'

        print("\nBook removed successfully\n")
        


print("WELCOME TO THE LIBRARY") # printing the statement

obj = Library() # creating an object of the class 'Library'

while True:
    print("\nEnter 1 to add a book\nEnter 2 to show the information of the library\nEnter 3 to remove a book\nEnter any other number to exit") # printing the statement

    choice = input() # taking input from the user
    
    try: 
        choice = int(choice)
        
    except:
        print("\nWrong Choice, Enter a Desired Number\n\n")
        continue
        
    if(choice == 1): 
        obj.AddBook()
    
    elif(choice == 2):
        obj.ShowInfo()
    
    elif(choice == 3):
        obj.RemoveBook()
    
    else:
        break
        

        
    
    
    