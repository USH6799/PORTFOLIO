# it is not my module if anyone is thinking that it is Sh_util.

# it is the pre-installed module in python.

# it helps to copy, move, rename, delete files and folders and high level file operations.

# Lets import it

import shutil

# Lets import os module also for our welfare otherwise many files will be scattered in your system.

import os

# the first method of shutil is shutil.copy(src , dst)

# it takes two arguments src - Source and dst - Destination.

# Like i want the content of this file to move to a new file in this folder, lets create dummy.py in the same folder and copy the stuff, You can do it manually by creating and copying it , but what if we have many files in our folder? we can use this method.

# os.chdir("./Notes") 

# # here write your own path or destination if any problem occurs or contact the feedback and mention the program name.

shutil.copy("Sh_UtilModule.py" , "dummy.py")

# Here Sh_UtilModule.py is the source and dummy.py is the destination.

# As Soon as you run the program a new file will be created in the same folder having same data as that of Sh_UtilModule.py.


# use os.remove("dummy.py") to remove the file from your folder, write the code and run it.

# shutil.copy2(src , dst) is an alternative method of shutil.copy(src , dst) but this method will copy every single original metadata, like time of creation, timestamps everything. Mostly in the industry we use shutil.copy(src , dst) method.

# Now what if i want to copy the whole folder? 

# then i can't use this method as it will copy only the content of the folder.

# we use shutil.copytree(src , dst) method.

# i will not show pratical implementation of this method , i prefer you to try it yourself.

# shutil.move(src , dst) method is used to move the file completely from one location to another and it mostly used as renaming any file also.

# shutil.rmtree(path) method is used to remove the folder at the specified path completely.

# Unfortunately shutil doesn't have a method to remove the file at the specified path. Instead i prefer to use os modeule and os.remove(path) method to remove the file at the specified path.