print("Hello Welcome to the task manager\nHere you are Able to Manage all your Tasks")
# \n -> to move the remaining text to next line

list=[]
# Array To Store Your Tasks

# Function to Add tasks
def addtask(task):
   # addtask(task) -> take task from user

    list.append(task)
   # .append ->add task at the index 0 in the 'list' Array

    print("task sucessfully added")

# function to remove tasks
def removetask(index):
   #  removetask(task) ->take the sr.no of task from User

    if(index-1<= index <=len(list)):
      # check for Wrong Sr.no input

      removedtask=list.pop(index-1)
      #.pop -> remove the task on Index given by User and Save that task in 'removedtask' variable  

      print("task removed: ",removedtask)
      #prints the removedtask

    else:
      #   handling wrong input or wrong sr.no
        print("wrong index value")

# function to check tasks
def checktask():

   for i, task in enumerate(list,1):
      # loop to Print all tasks Stored in Array
      # i -> temporary variable for iteration
      # task -> For Checking tasks
      # enumerate -> Checks Each item in array 
      
      print(i,". ",task)
      # prints the tasks

#Main loop
while(True):
    
    print("Do you want to Add a task ,Remove a task,Check the list")
   #  asking user for adding,removing or checking tasks

    print("|1 for add|2 for delete|3 for check|4 for quit|")
   #  1 -> add task
   #  2 -> remove task
   #  3 -> check task
   #  4 -> exit

   #For handling Wrong input 
    try:
      #  for correct input

       choice=int(input("option: "))
      #taking input From user
       
    except:
       #For Wrong Input
       print("wrong option choosed")

      #  Re-run the loop
       continue
    
   #  for 1st option
    if(choice==1):

      task=input("enter the task you want to add: ")
      # taking input as task and storing it in variable 'task'

      addtask(task)
      # calling addtask function to add the input

      print("\n------------------------------------\n")
  
      continue
      # To Re-run the loop 

   # for 2nd option
    elif(choice==2):
        index=int(input("enter the index no. of the task you want to remove: "))
      #  taking the Serial Number Of task To remove it

        removetask(index)
      #  calling removetask function to remove task

        print("\n------------------------------------\n")

        continue
      # to Re-run the Loop
    
   #  for 3rd choice
    elif(choice==3):
        
        checktask()
      #   calling checktask function to print all tasks

        print("\n------------------------------------\n")

        continue
      # to Re-run the loop

      # for 4th choice
    elif(choice==4):
       
       break
      # breaking loop/ending program
      
      #for wrong input 
    else:
        
        print("Wrong option choosed")
        continue
   #  to Re-run the loop