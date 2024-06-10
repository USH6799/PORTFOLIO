# in this code will we understand file handling , 

# To access any text file or any file in your code then:

# Syntax:- var = open("filename.txt" , "mode")

# Here open() is the fnc to open any external file,

# Next 2 arguments are passed in the fnc, first is the name of the file and second is the mode in which it opens.

# It has many modes like:

# w - write:- it will delete all data and overwrite the file if it already exists , if file doesn't exist in the same directory then it will create a new file.

# r - read:- it will read the file and doesn't allow to write in the file and throws error if file doesn't exist.

# a - append:- it will add the data at the end of the file if file doesn't exist in the same directory then it will create a new file.

# r+ - read and write:- it will read and write in the file if file doesn't exist in the same directory then it will create a new file.

# w+ - write and read:- it will delete all data and overwrite the file if it already exists , if file doesn't exist in the same directory then it will create a new file and u can read it also.

# a+ - append and read:- it will add the data at the end of the file if file doesn't exist in the same directory then it will create a new file and u can read it also.


f = open('file.txt' , 'r') # this will read the content in the file and stores it in var 'f'

print(f.read()) # this will read the content inside the file and print it on the screen.

# OUTPUT:- <content here>

f.close() # This is required to close the file otherwise it will not work and throws an error, but there is a trick to by pass it.

with open("file.txt" , 'w') as f1: # this will delete all data and overwrite the file if it already exists , if file doesn't exist in the same directory then it will create a new file.
    
    f1.write("Hello World") # this will write Hello World in the file and remove all the content before.
    
    # you have no need to close your file here because u used diffrent syntax using with and as keyword.
    
    # In File:- Hello World
    

with open("file.txt" , 'a') as f2: # this will add the data at the end of the file if file doesn't exist in the same directory then it will create a new file.
    
    f2.write("Hello World, i am continuing...") # this will write Hello World, i am cotinuing... in the file and add it at the end of the file.
    
    # Inside the file:- Hello WorldHello World, i am continuing...

    # you have no need to close your file here because u used diffrent syntax using with and as keyword.
    

# readlines() method used to read several lines at once.

# Example i have marks of 3 students in 3 diffrent subjects , lets write it in file,

f3 = open("mark.txt" , 'w+') # this will delete all data and overwrite the file if it already exists , if file doesn't exist in the same directory then it will create a new file.

f3.write("45 , 48 , 52\n34 , 37 , 41\n74 , 76 , 78") # This will write 3 lines in the file and remove all the content before.

f3.read()

# OUTPUT:- 45 , 48 , 52
#          34 , 37 , 41
#          74 , 76 , 78

# But if i use readline() method then it will return a list of lines.

line = f3.readline()

while True:
    
    print(line) 
    if not line:
        break
    
# OUTPUT:- 45 , 48 , 52
#          34 , 37 , 41
#          74 , 76 , 78
# 
# 

# Lets prints the marks in correct way:-

mark = open("mark.txt" , 'r') # this will read the file and stores it in var mark
i = 0 # this will count the number of lines

while(True):
    i = i + 1 # this will count the number of lines
    
    line = mark.readline() # this will read the first line

    if not line: # if line is empty then break the loop
        
        break
    
    m1 = line.split(',')[0] # this will split the line and store the first part in m1
    m2 = line.split(',')[1] # this will split the line and store the second part in m2
    m3 = line.split(',')[2] # this will split the line and store the third part in m3
    
    print(f'Marks of Student {i} in Maths is: {m1}')
    print(f'Marks of Student {i} in Maths is: {m2}')
    print(f'Marks of Student {i} in Maths is: {m3}')

f3.close()

# WriteLines() method,

f = open('file2.txt' , 'r+') # opening file2.txt in read and write mode

line = ["Hello i am 1st line\n" , "Hlo I am 2nd line" , "Hello i am 3rd line"] # this will store 3 lines in a list

for text in line: # this will write 3 lines in the file
    f.writelines(text) # this will write 3 lines in the file

f.close() # this will close the file


    