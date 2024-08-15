class Solution: 
    # A class named 'Solution' is created.

    def MissingNum(nums): 
        # A method named 'MissingNum' is defined within the class 'Solution' taking one parameter 'nums'.
        
        n = len(nums) 
        # The length of the input list 'nums' is calculated and stored in the variable 'n'.
        # For the given input list, n = 51.
        
        nums = set(nums) 
        # The list 'nums' is converted into a set to eliminate any duplicate values and for faster lookup.
        # After conversion, 'nums' will remain the same as all elements are unique in this case.

        for num in range(0, n + 1): 
            # A for loop is initiated, where 'num' will take values from 0 to n (inclusive).
            # The range is from 0 to 52 (since n+1 = 51+1 = 52).
            
            if num not in nums: 
                # This if statement checks whether the current value of 'num' is not present in the set 'nums'.
                # If 'num' is not found in 'nums', it means 'num' is the missing number.
                
                print(num) 
                # The missing number is printed out.
                # The loop terminates as soon as the missing number is found.
        
# Example Input: [0, 1, 2, 3, ..., 49, 50] (missing number is 8)

Solution.MissingNum([0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50])

# Dry Run:
# n = 51 (Length of the input list)
# nums = {0, 1, 2, ..., 49, 50} (Set conversion)
# The for loop starts with num = 0, checks if 0 is in nums (it is).
# num = 1, checks if 1 is in nums (it is), and so on.
# ...
# num = 8, checks if 8 is in nums (it is not).
# Since 8 is not in nums, 8 is printed as the missing number.
