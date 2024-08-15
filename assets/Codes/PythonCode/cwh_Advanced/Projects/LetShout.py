import pyttsx3
# Importing the pyttsx3 library for text-to-speech conversion.

l = []
# Initializing an empty list 'l' to store names for shoutouts.

while True:
    # A while loop to continuously prompt the user for input until they choose to exit.
    
    name = input("Enter the Name to Give a Shoutout or enter q to Exit: ")
    # Asking the user to input a name or 'q' to quit the loop.
    
    if(name == 'q'):
        break
        # If the user inputs 'q', the loop breaks, ending the input process.
    
    else:
        l.append(name)
        # If the user inputs a name, it's added to the list 'l'.
        continue
        # The loop continues to prompt for the next name.

# After exiting the loop, the program iterates over the list 'l' to give shoutouts.
for name in l:
    engine = pyttsx3.init()
    # Initializing the pyttsx3 engine for text-to-speech.

    engine.say("ShoutOut To " + name) 
    # Using the text-to-speech engine to say "ShoutOut To" followed by the name.
    
    engine.runAndWait()
    # Running the speech engine to deliver the shoutout.

# To stop the program press CTRL + Z 
