class AdamNumber:
    def __init__(self):
        # Initialize variables
        self.num = 0
        self.rev = 0

    def read(self):
        # Method to read the number from the user
        self.num = int(input("Enter the Number: "))

    def prime(self):
        # Method to check if a number is prime
        if self.num < 2:
            return False
        
        for i in range(2, self.num):
            if self.num % i == 0:
                return False
        return True

    def reverse(self):
        # Method to reverse the digits of the number
        temp = self.num
        val = 0

        while temp != 0:
            digit = temp % 10
            val = val * 10 + digit
            temp //= 10

        return val

    def check(self):
        # Method to check if the number and its reverse are both prime (Adam number)
        if self.prime():
            self.num = self.reverse()

            if self.prime():
                print("It is an Adam Number")
            else:
                print("It is not an Adam Number")
        else:
            print("It is not an Adam Number")

# Main block to run the program
if __name__ == "__main__":
    obj = AdamNumber()  # Create an object of AdamNumber

    obj.read()  # Read the number from the user
    obj.check()  # Check if it's an Adam number

# Dry Run Example:
# Input: 13
# Step 1: Check if 13 is prime -> Yes
# Step 2: Reverse 13 -> 31
# Step 3: Check if 31 is prime -> Yes
# Output: "It is an Adam Number"
#
# Input: 12
# Step 1: Check if 12 is prime -> No
# Output: "It is not an Adam Number"
