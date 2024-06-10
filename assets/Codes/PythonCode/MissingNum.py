class Solution: # a class is created
    
    def MissingNum(nums): # a method is created taking 1 parameter
        
        n = len(nums) # Storing the length of the array in var 'n'
        
        nums = set(nums) # Converting the array into a set
        
        for num in range(0 , n + 1): # Here, the value of var 'num' goes from 0 to n+1 and it gives the output as True and the for loop is executed.
            
            if num not in nums: # Checking if the value of var 'num' is not in the set, if it is not in the set then if block will run.
                
                print(num) # printing the value of var 'num'
        
                
Solution.MissingNum([0,1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50])