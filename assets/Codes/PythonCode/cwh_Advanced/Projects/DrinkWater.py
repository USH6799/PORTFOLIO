import pyttsx3
import time

eng = pyttsx3.init()

t = input("Enter The Timer You want to set For Your Water Reminder in minutes: ")

t = float(t)

def call():
    eng.say("Time For Drinking Water")  
    eng.runAndWait()
    if(input("Enter ok to Stop the Reminder: ") == "ok"):
        eng.stop()
        
    else:
        call()   

time.sleep(t * 60)

call()