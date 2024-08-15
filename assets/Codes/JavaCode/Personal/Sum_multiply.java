package Personal;
// package Loops;
// This code calculates the sum of the multiplication of a given number (n) with numbers from 1 to 10.

public class Sum_multiply {
    public static void main(String[] args) {
        // Initializing the number (n) and the sum
        int n = 8;  // The number to be multiplied
        int sum = 0;  // Variable to store the cumulative sum

        // Looping from 1 to 10 to calculate the sum of the multiplication
        for (int i = 1; i <= 10; i++) {
            // Adding the result of multiplying 'n' with 'i' to the sum
            sum += i * n;
            // For each iteration, multiply 'n' by 'i' and add the result to 'sum'
        }

        // Printing the sum
        System.out.println(sum);
        // Outputs the total sum after the loop completes
    }
}

///////////////////////////////////////////////////////

/*
Dry Run Example:
Let's assume n = 8.

1. For i = 1:
   - Multiplication: 8 * 1 = 8
   - Sum after addition: sum = 0 + 8 = 8

2. For i = 2:
   - Multiplication: 8 * 2 = 16
   - Sum after addition: sum = 8 + 16 = 24

3. For i = 3:
   - Multiplication: 8 * 3 = 24
   - Sum after addition: sum = 24 + 24 = 48

4. For i = 4:
   - Multiplication: 8 * 4 = 32
   - Sum after addition: sum = 48 + 32 = 80

5. For i = 5:
   - Multiplication: 8 * 5 = 40
   - Sum after addition: sum = 80 + 40 = 120

6. For i = 6:
   - Multiplication: 8 * 6 = 48
   - Sum after addition: sum = 120 + 48 = 168

7. For i = 7:
   - Multiplication: 8 * 7 = 56
   - Sum after addition: sum = 168 + 56 = 224

8. For i = 8:
   - Multiplication: 8 * 8 = 64
   - Sum after addition: sum = 224 + 64 = 288

9. For i = 9:
   - Multiplication: 8 * 9 = 72
   - Sum after addition: sum = 288 + 72 = 360

10. For i = 10:
    - Multiplication: 8 * 10 = 80
    - Sum after addition: sum = 360 + 80 = 440

Final Output:
440
*/
