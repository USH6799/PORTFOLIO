import time

hour = time.strftime("%H")

hour = int(hour)

if(hour < 6):
    print("Good Night")

elif(hour < 12):
    print("Good Morning")

elif(hour < 18):
    print("Good Afternoon")

else:
    print("Good Evening")