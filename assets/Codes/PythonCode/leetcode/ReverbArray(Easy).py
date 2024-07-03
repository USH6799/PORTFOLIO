# Question was to create a fnc that reverses the string s and returns it but the string is in array type at which characters of the string are the parts of Array.

# Input:- s = ['h' , 'e' , 'l' , 'l' , 'o']

# OUTPUT:- ['o', 'l', 'l', 'e', 'h']


str = input("Enter the String: ")

arr = []

for char in str:
    arr.append(char)
    
newarr = []    

for i in range(len(arr) - 1 , -1 , -1):
    newarr.append(arr[i])
    
    
print("The Reversed Array is: " , newarr)