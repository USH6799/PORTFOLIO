class ConfusingArrow:  # Here, the class name is ConfusingArrow.
    
    def east_west(self):  # Here, the function name is east_west.
        
        for i in range(1, 6):  # A for loop runs from 1 to 6 to print rows.
            
            for j in range(1, 6 + i):  # A nested for loop runs from 1 to 6+i to print columns.

                if i < 3 and j <= 5:  # If the row index 'i' is less than 3 and column index 'j' is less than or equal to 5.
                    
                    print("  ", end="")  # Print two spaces without moving to the next line.
                    
                else:  # If the condition is not met, execute the else block.
                    
                    print("< ", end="")  # Print "< " without moving to the next line.

            print()  # Move to the next line after the inner loop completes.

        
        for i in range(4, 0, -1):  # A for loop runs from 4 to 1 (decrementing) to print rows.
            
            for j in range(5 + i, 0, -1):  # A nested for loop runs from 5+i to 1 (decrementing) to print columns.
                
                if i < 3 and j > i:  # If the row index 'i' is less than 3 and column index 'j' is greater than 'i'.
                    
                    print("  ", end="")  # Print two spaces without moving to the next line.

                else:  # If the condition is not met, execute the else block.
                    
                    print("< ", end="")  # Print "< " without moving to the next line.
                    
            print()  # Move to the next line after the inner loop completes.

    def west_east(self):  # Here, the function name is west_east.
        
        for i in range(1, 6):  # A for loop runs from 1 to 6 to print rows.
            
            for j in range(5, i, -1):  # A nested for loop runs from 5 to i (decrementing) to print initial spaces.
                
                print("  ", end="")  # Print two spaces without moving to the next line.
                
            for s in range(1, i + 1):  # Another nested for loop runs from 1 to i to print '>'.
                
                print("> ", end="")  # Print "> " without moving to the next line.
                
            for d in range(1, 6):  # Another nested for loop runs from 1 to 6 to print additional '>'.
                
                if i < 3:  # If the row index 'i' is less than 3.
                    
                    print("  ", end="")  # Print two spaces without moving to the next line.
                    
                else:  # If the condition is not met, execute the else block.
                    
                    print("> ", end="")  # Print "> " without moving to the next line.
                    
            print()  # Move to the next line after the inner loop completes.

        
        for i in range(4, 0, -1):  # A for loop runs from 4 to 1 (decrementing) to print rows.
            
            for s in range(5, i, -1):  # A nested for loop runs from 5 to i (decrementing) to print initial spaces.
                
                print("  ", end="")  # Print two spaces without moving to the next line.
                
            for j in range(1, i + 1):  # Another nested for loop runs from 1 to i to print '>'.
                
                print("> ", end="")  # Print "> " without moving to the next line.
                
            for d in range(1, 6):  # Another nested for loop runs from 1 to 6 to print additional '>'.
                
                if i < 3:  # If the row index 'i' is less than 3.
                    
                    print("  ", end="")  # Print two spaces without moving to the next line.
                    
                else:  # If the condition is not met, execute the else block.
                    
                    print("> ", end="")  # Print "> " without moving to the next line.
                    
            print()  # Move to the next line after the inner loop completes.

    def north_south(self):  # Here, the function name is north_south.
        
        for i in range(1, 6):  # A for loop runs from 1 to 6 to print rows.
            
            for s in range(1, 6 - i):  # A nested for loop runs from 1 to 6-i to print initial spaces.
                
                print("   ", end="")  # Print three spaces without moving to the next line.
                
            for j in range(1, i + 1):  # Another nested for loop runs from 1 to i to print 'V'.
                
                print(" V ", end="")  # Print " V " without moving to the next line.
                
            for j in range(1, i):  # Another nested for loop runs from 1 to i-1 to print additional 'V'.
                
                print(" V ", end="")  # Print " V " without moving to the next line.
                
            print()  # Move to the next line after the inner loop completes.

        
        for i in range(1, 6):  # A for loop runs from 1 to 6 to print rows.
            
            for j in range(1, 10):  # A nested for loop runs from 1 to 10 to print columns.
                
                if j < 3 or j > 7:  # If the column index 'j' is less than 3 or greater than 7.
                    
                    print("   ", end="")  # Print three spaces without moving to the next line.
                    
                else:  # If the condition is not met, execute the else block.
                    
                    print(" V ", end="")  # Print " V " without moving to the next line.
                    
            print()  # Move to the next line after the inner loop completes.

    def south_north(self):  # Here, the function name is south_north.
        
        for i in range(1, 6):  # A for loop runs from 1 to 6 to print rows.
            
            for j in range(1, 10):  # A nested for loop runs from 1 to 10 to print columns.
                
                if j < 3 or j > 7:  # If the column index 'j' is less than 3 or greater than 7.
                    
                    print("   ", end="")  # Print three spaces without moving to the next line.
                    
                else:  # If the condition is not met, execute the else block.
                    
                    print(" ^ ", end="")  # Print " ^ " without moving to the next line.
                    
            print()  # Move to the next line after the inner loop completes.

        
        for i in range(1, 6):  # A for loop runs from 1 to 6 to print rows.
            
            for s in range(1, i):  # A nested for loop runs from 1 to i-1 to print initial spaces.
                
                print("   ", end="")  # Print three spaces without moving to the next line.
                
            for j in range(i, 6):  # Another nested for loop runs from i to 5 to print '^'.
                
                print(" ^ ", end="")  # Print " ^ " without moving to the next line.
                
            for d in range(1, 6 - i + 1):  # Another nested for loop runs from 1 to 6-i+1 to print additional '^'.
                
                print(" ^ ", end="")  # Print " ^ " without moving to the next line.
                
            print()  # Move to the next line after the inner loop completes.

if __name__ == "__main__":  # Standard Python idiom to execute the main function.
    
    print("1st Pattern Below:\n")  # Print a message to indicate the first pattern.
    
    direction = ConfusingArrow()  # Create an object 'direction' of the class 'ConfusingArrow'.
    
    direction.west_east()  # Call the west_east function using the object 'direction'.

    print("\n2nd Pattern Below:\n")  # Print a message to indicate the second pattern.
    
    direction.east_west()  # Call the east_west function using the object 'direction'.

    print("\n3rd Pattern Below:\n")  # Print a message to indicate the third pattern.
    
    direction.south_north()  # Call the south_north function using the object 'direction'.

    print("\n4th Pattern Below:\n")  # Print a message to indicate the fourth pattern.
    
    direction.north_south()  # Call the north_south function using the object 'direction'.
