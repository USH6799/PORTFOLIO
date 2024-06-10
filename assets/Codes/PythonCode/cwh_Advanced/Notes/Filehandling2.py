# Now remember the file handling, if you want to change any specific letters , words inside the file then recreating the file content take more time and less convient, instead we will use seek() and tell() methods to play with files.

f = open("file.txt" , 'w+') # this will starts writing in the file and also creates a file if it doesn't exist in the same directory. 

f.write("You Can Write Anything Here For Testing like\nI had Written Above\nAnd also Below,\nThis is below Content") # this will write in the file

# LEts check the type of f:

print(type(f)) # OUTPUT:- <class '_io.TextIOWrapper'>

# as you can see it is the io(input/output) text wrapper.

# Imagine a cursor is at 0 byte position or at the first letter:

# seek() method is used to move the cursor forward or backward in the file.

# it doesn't change any text or content inside the file. seek(byte) , here byte is the position.

# read(byte) , this is used to get the content inside the file. It will take next number of bytes , means the text and returns it to the caller.


# Text:- |You Can Write Anything Here For Testing like

# here the position of the cursor is at 0 byte position. means at -> | this symbol. 

f.seek(8) # this will move the cursor to 5 byte position in forward direction.

# Text:- You Can |Write Anything Here For Testing like

print(f.read(5)) # this will read the next 5 bytes and returns it to the caller.

# text:- You Can |Write| Anything Here For Testing like

# here 1st | defines the initial position and 2nd | defines the end position.

# and returns the text btw them to the caller.

print(f.tell()) # this tells the current cursor position in the document.


# Truncate() fnc in Python.

# the truncate fnc heps to write specific number of bytes in the file.

# this truncate(byte) fnc will remove all the content inside the file and write specific content in the file. it takes number of bytes in the file to specify the content characters length.

f1 = open("sample.txt" , 'w+') # Opening a new file in write and read mode

f1.write("Hello World") # writing hello world in the file

f1.truncate(5) # truncating the file to 5 bytes or reducing the size of the file to 5 bytes and remove the additional content, like here it takes first 5 bytes and store in the file and remove the rest.

content = f1.read() # saving the content of the file in var 'content'

print(content) # printing the content of the file 

# OUTPUT:- Hello 

# output will be hello because it comes in the first byte space and remove the rest of the content. 
