# Command line utitlties are the functions that can be used to perform various tasks in the command line or directly at terminal.   

# In python there are 3 types of command line utilities:

# 1. System utilities
# 2. User utilities
# 3. Application utilities

# there are argpass module in python which is used to pass arguments in the command line.

# syntax is as follows:

import argparse # importing argparse module
import requests # importing requests module

parser = argparse.ArgumentParser() # creating parser object to parse the arguments

# lets add some command line arguments

parser.add_argument("url" , help = "Enter the url") # url is the name of the argument and help is the description of the argument

# this means we created a parser object with url as the name of the argument and help as the description of the argument.

parser.add_argument("Output" , help="Which name you want to give to the file") # Output is the name of the argument and "Which name you want to give to the file" is the description of the argument.


# Now lets parse the arguments

args = parser.parse_args() # this will parse the arguments and store it in args, or converts over arguments into readable format for the program.

# Now lets use the arguments


# lets create a request code to download any file.

def Download(url , filename): # url is the name of the argument and filename is the name of the argument
                             
    with requests.get(url , stream = True) as r: # with requests.get() function we can download any file from the internet.
        
        r.raise_for_status() # this will raise an error if the file is not found.
        
        with open(filename , 'wb') as f: # this will open the file in binary mode and write the content in the file.
            
            for chunk in r.iter_content(chunk_size = 8192): # this will download the file in chunks of 8192 bytes.

                f.write(chunk) # this will write the content in the file
                
    return filename


print(args.url) # prints the url argument

print(args.Output) # prints the Output argument

Download(args.url , args.Output) # calling the function to download the file

# in your terminal window write: 
# 1. cd <Your Current Directory Path>
# 2. Press Enter
# 3. python CmdlineUtility.py <any pic/data url> <name of file>
# 4. Press Enter

# Result: U will see your file downloaded in the same directory.