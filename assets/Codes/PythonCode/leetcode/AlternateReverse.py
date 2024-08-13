class AlternateReverse:
    def __init__(self):
        
        # Instance variables to store the original string and the result
        self.str = ""
        self.res = ""

    def input_string(self):
        # Method to take input from the user
        
        self.str = input("Enter the Sentence Below: ")
        
        # Add a space at the end to handle the last word properly
        self.str += " "

    def rev(self, w):
        # Method to reverse a word
        
        return w[::-1]  # Slicing method to reverse the string

    def alternate(self, odd):
        # Iterate over the entire string
        
        while ' ' in self.str:
            
            # Find the index of the first space
            i = self.str.index(' ')
            
            if odd:
                # Reverse the word and add to the result if odd
                
                self.res += self.rev(self.str[:i]) + " "
                # Update the string by removing the processed word
                
                odd = False
            else:
                # Skip reversing and just add the word as is
                self.res += self.str[:i] + " "
                
                odd = True
            
            # Update the string by removing the processed word
            self.str = self.str[i+1:]

    def display(self):
        # Method to display the result
        print(self.res)

# Main block to run the program
if __name__ == "__main__":
    # Create an instance of AlternateReverse
    obj = AlternateReverse()

    # Take input from the user
    obj.input_string()

    # Process the input to alternate between reversing words
    obj.alternate(False)

    # Display the final result
    obj.display()

# Dry Run Example:
# Input: "Hello world this is Python"
# Step 1: Initial string: "Hello world this is Python "
# Step 2: First word "Hello" is kept as is (even word): res = "Hello "
# Step 3: Second word "world" is reversed: res = "Hello dlrow "
# Step 4: Third word "this" is kept as is (even word): res = "Hello dlrow this "
# Step 5: Fourth word "is" is reversed: res = "Hello dlrow this si "
# Step 6: Fifth word "Python" is kept as is (even word): res = "Hello dlrow this si Python "
# Final Output: "Hello dlrow this
