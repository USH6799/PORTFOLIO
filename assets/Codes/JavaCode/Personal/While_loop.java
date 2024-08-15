package Personal;
// package Loops;

public class While_loop {
    public static void main(String[] args) {
        int number = 100;  // Initialize the number variable to 100
        
        // Loop until the number is less than or equal to 200
        while (number <= 200) {  // Condition to check if 'number' is within the range
            // Print the current number followed by a tab
            System.out.print(number + "\t");  // Output the current number and a tab space
            
            // Increment the number by 1 for the next iteration
            number++;  // Increase 'number' by 1 to move to the next number
        }
    }
}

/////////////////////////////////////////////////

/*
Dry Run Example:
Initial value: number = 100

1. Start of the loop:
   - number = 100
   - Print: 100\t (Output: "100\t")
   - Increment number to 101

2. Loop iteration:
   - number = 101
   - Print: 101\t (Output: "100\t101\t")
   - Increment number to 102

3. Loop iteration:
   - number = 102
   - Print: 102\t (Output: "100\t101\t102\t")
   - Increment number to 103

4. Continue loop iterations until:
   - number = 199
   - Print: 199\t (Output: "100\t101\t...199\t")
   - Increment number to 200

5. Final loop iteration:
   - number = 200
   - Print: 200\t (Output: "100\t101\t...200\t")
   - Increment number to 201

6. Exit loop as number > 200

Final Output:
100\t101\t102\t...199\t200\t
*/
