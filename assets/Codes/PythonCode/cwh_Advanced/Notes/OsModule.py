# We will undestand about the os module in this tutorial.

# firstly u have to import os

import os # this module helps to work with your operating syatem and directory files, you can add , remove , change ,etc with files with this module.

# Example i want to create 100 folders and there name should be day wise like day1 , day2 , day3 etc.. 

# But creating each folder manually will cause huge time consuming.

# Instead i will use os module to create them .

if(os.path.exists("Delete Me")): # checking if the folder Delete Me is already present or not, if it is present then it will delete it.
    
    # if Delete Me folder is already present then it will not create any extra folder.
    
    pass # pass is a null statement

else:
    os.mkdir("Delete Me") # this mkdir(str) fnc used to create a folder or directory at the same path of the program and name it as the string passed in it.
    

# Like here when u run this program , a Delete Me folder will be created at the same path of the program.

# Now for numbering each day from 1 to 100, i will use for loop,

for i in range(1 , 101 ): # for loop iterating on var i in range 1 to 101 and i iterates from 1 to 100.
    
    if(os.path.exists(f"Delete Me/Day {i}")): # checking if the folder Delete Me/Day i is already present or not, if it is present then it will not create any extra folder.
        
        pass # pass is a null statement
    
    else: # this will be executed when if code is not executed or becomes False.
        
        os.mkdir(f"Delete Me/Day {i}") # creating a new folder inside the created folder Delete Me at the same path of the program and name it as Day i.
    
    # Here used formatted String to add i in Day {i} format.
    
    # When u run the program u will show 100 folders inside that folder at once, in less than a second otherwise without this , you have to waste a lot of time for creating each file manually.
    

# Oh no! i had done a mistake i want to write USH day , now how can i fix it.

# Does i need to rename each individually.

# The answer is no, coding will assist me in this. Lets see how,

for i in range(1 , 101 ): # for loop iterating on var i in range 1 to 101 and i iterates from 1 to 100.
    
    if(os.path.exists(f"Delete Me/Day {i}")): # checking if the folder Delete Me/Day i is already present or not, if it is present then it will not create any extra folder.
        
        pass # pass is a null statement

    else: # this will be executed when if code is not executed or becomes False.

        os.rename(f"Delete Me/Day {i}" , f"Delete Me/USH Day {i}") 

    # The rename(old_name , new_name) fnc used to rename the folder at the same path of the program and name it as the string passed in it.
    
    # rename() method renames all the folders and save them
    
# Now i want to know the number of folders inside Delete Me folder.

folders = os.listdir("Delete Me") # this listdir(str) fnc used to list the folder at the same path of the program and provide a list datatype values. 

print(type(folders)) # this will show that folders is a list datatype.

for folder in folders: # for loop iterating on var folder in folders.
    
    print(folder) # printing the value of folder
    
# Now lets know how to delete folders, u can use rmdir(str) fnc. 
    
    # run this code 'os.rmdir(f"Delete Me/{folder}")' in a new python file to remove all the folders inside the Delete Me folder.
    
# Run the code os.rmdir("Delete Me") to remove the Delete Me folder.




