import pyttsx3
  
l = ["Harry" , "Abhay" , "Sachin" , "Rahul" , "Vijay" , "Ramesh" , "harsh" , "Uttkarsh"] # enter any names in this list to give them shoutout by python.
  
for name in l:
    engine = pyttsx3.init()

    engine.say("ShoutOut To" + name) 
    
    engine.runAndWait()
  
# To stop the program press 
# CTRL + Z 