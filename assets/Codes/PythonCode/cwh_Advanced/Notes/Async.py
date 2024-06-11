# lets know how to do async programming in python, async means asynchronous. which means that it is the side fnc which runs only when the answer comes from third party urls.

# Lets write three fncs each running for specific time.

import time # importing time module
import asyncio # importing asyncio module

def fnc1(): # fnc1 is the name of the function

    time.sleep(7) # it will sleep for 7 seconds and runs the code after 7 seconds.

    print("fnc1 Completed") # it will print fnc1 completed after 7 seconds.


def fnc2(): # fnc2 is the name of the function

    time.sleep(5) # it will sleep for 5 seconds and runs the code after 5 seconds.

    print("fnc2 Completed") # it will print fnc2 completed after 5 seconds.
    

def fnc3(): # fnc3 is the name of the function

    time.sleep(3) # it will sleep for 3 seconds and runs the code after 3 seconds.

    print("fnc3 Completed") # it will print fnc3 completed after 3 seconds.
    
    
fnc1() # calling the function
fnc2() # calling the function
fnc3() # calling the function

# OUTPUT:- fnc1 Completed
#          fnc2 Completed
#          fnc3 Completed
    
# Lets calculate the total time taken by the three functions to complete.

# fnc1 takes 7 seconds
# fnc2 takes 5 seconds
# fnc3 takes 3 seconds
# total time taken by all three functions is 17 seconds 

# But i have a doubt, the third fnc was completed in 3 sec so why not its answer comes first in the output.

# This because python is single threaded and having sync codes in it but we can have async codes in it.

# sync codes means when the first fnc runs and completes then only the second and third fncs will run.

# When second fnc runs and completes then only third fnc will run.


# It means it is taking a lot of time to complete the each fnc.

# can we run all the fncs in parallel or together?

# Answer is yes using async     

# Lets write 2 async and 1 sync fncs.

async def asyncFnc1(): # asyncFnc1 is the name of the function

    time.sleep(7) # it will sleep for 7 seconds and runs the code after 7 seconds.

    print("asyncFnc1 Completed") # it will print asyncFnc1 completed after 7 seconds.


async def asyncFnc2(): # asyncFnc2 is the name of the function

    time.sleep(5) # it will sleep for 5 seconds and runs the code after 5 seconds.
    
    print("asyncFnc2 Completed") # it will print asyncFnc2 completed after 5 seconds.
    
def syncFnc3(): # syncFnc3 is the name of the function

    time.sleep(3) # it will sleep for 3 seconds and runs the code after 3 seconds.

    print("syncFnc3 Completed") # it will print syncFnc3 completed after 3 seconds.
    
    
async def main(): # main is the name of the function
    
    # here we used a async function with a await keyword which runs all the async fncs at once.

    await asyncFnc1() # calling the async function
    await asyncFnc2() # calling the async function
    syncFnc3() # calling the function
    
# calling the main function
asyncio.run(main()) # we can also use 'asyncio.run(main())' to run the main function

# OUTPUT:- asyncFnc2 Completed
#          asyncFnc1 Completed
#          syncFnc3 Completed

# as you see here also the sync code completed first but it was printed at last, because as we call the main() method it runs the first two async fncs together at the same time.

# the 2nd async fnc was completed in 5 sec and prints at first , then the 1st async fnc was completed in 7 sec or u can say 2 seconds after completion of 2nd async fnc.

# And at last it runs the sync code.


    