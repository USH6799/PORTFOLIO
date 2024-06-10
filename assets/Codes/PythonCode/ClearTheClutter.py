import os  # Importing os module.

# Change directory to the specified folder path.
os.chdir("C:/Users/USH/Pictures/collection")  # Use your own folder path and use / instead of \ in your path.

# List all files in the current directory.
folder = os.listdir(os.getcwd())  # Get the current working directory and list its contents.

# Dictionary to keep track of counts for each file extension.
extension_counts = {}

for file in folder:  # Iterate over each file in the folder.
    if os.path.isfile(file):  # Ensure that it's a file and not a directory.
        ext = file.split(".")[-1]  # Split the file name and get the extension.
        
        # Update the count for the current extension.
        if ext not in extension_counts:
            extension_counts[ext] = 0
        extension_counts[ext] += 1
        
        # Rename the file with the current count and extension.
        new_name = f"{extension_counts[ext]}_{ext}.{ext}"
        os.rename(file, new_name)
