import pyttsx3

l = []

while True:
    name = input("Enter the Name to Give a Shoutout or enter q to Exit: ")
    
    if(name == 'q'):
        break
    
    else:
        l.append(name)
        continue

  
for name in l:
    engine = pyttsx3.init()

    engine.say("ShoutOut To" + name) 
    
    engine.runAndWait()
  
# To stop the program press 
# CTRL + Z 