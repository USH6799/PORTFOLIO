# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

# Ex:- nums = [1,5,3,6,7]
#      target = 8

# OUTPUT:- [1,2]

# Explanations: bacause nums[1] + nums[2] == 8 we return 1,2 as their indices.


# Straight Combination(single):-

target = int(input("\nEnter the target: "))

nums = [2,2,7,5,3,5,8,3,6,8,5,8,1,3,2,2,4,0]
print("Single Combination Results Below!")

for i in range(0 , len(nums) - 1):
    
    if(nums[i] + nums[i + 1] == target and nums[i] != nums[i + 1]):
        print(f"Found {nums[i] , nums[i+1]} at index {i,i+1}")
    
    
        


# Multi Combinations:-

print("-------------------------------------\n\nmulti Combination Results are Below!")

for i in range(0 , len(nums)):
    
    for j in range(i + 1 , len(nums)):
        if(nums[i] + nums[j] == target and nums[i] != nums[j]):
            print(f"Found {nums[i] , nums[j]} at index {i,j}")
            
