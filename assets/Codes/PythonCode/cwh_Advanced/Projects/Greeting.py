import time  # Import the time module to access time-related functions

# Get the current hour in 24-hour format as a string
hour = time.strftime("%H")  

# Convert the hour from a string to an integer
hour = int(hour)  

# Check if the hour is less than 6 (midnight to 5:59 AM)
if hour < 6:
    print("Good Night")  # Print "Good Night" if the condition is true

# Check if the hour is between 6 (inclusive) and 12 (exclusive)
elif hour < 12:
    print("Good Morning")  # Print "Good Morning" if the condition is true

# Check if the hour is between 12 (inclusive) and 18 (exclusive)
elif hour < 18:
    print("Good Afternoon")  # Print "Good Afternoon" if the condition is true

# If none of the above conditions are met, it must be evening (18:00 or later)
else:
    print("Good Evening")  # Print "Good Evening" as a default option
