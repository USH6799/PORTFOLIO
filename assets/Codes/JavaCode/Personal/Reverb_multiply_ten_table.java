package Personal;

public class Reverb_multiply_ten_table {
    public static void main(String[] args) {
        // Setting the value of 'n' to 10
        int n = 10;
        // 'n' is the number for which we will print the multiplication table

        // Looping from 10 down to 1
        for (int i = 10; i >= 1; i--) {
            // Printing the multiplication table of 10 in reverse order
            System.out.printf("%d X %d = %d\n", n, i, n * i);
            // Formats and prints the current value of 'i' in the multiplication table of 10
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////

/*
Dry Run Example:
The loop iterates from i = 10 down to i = 1. For each iteration, the multiplication table is printed in reverse order.

1. For i = 10:
   - Output: "10 X 10 = 100"

2. For i = 9:
   - Output: "10 X 9 = 90"

3. For i = 8:
   - Output: "10 X 8 = 80"

4. For i = 7:
   - Output: "10 X 7 = 70"

5. For i = 6:
   - Output: "10 X 6 = 60"

6. For i = 5:
   - Output: "10 X 5 = 50"

7. For i = 4:
   - Output: "10 X 4 = 40"

8. For i = 3:
   - Output: "10 X 3 = 30"

9. For i = 2:
   - Output: "10 X 2 = 20"

10. For i = 1:
    - Output: "10 X 1 = 10"

Final Output:
10 X 10 = 100
10 X 9 = 90
10 X 8 = 80
10 X 7 = 70
10 X 6 = 60
10 X 5 = 50
10 X 4 = 40
10 X 3 = 30
10 X 2 = 20
10 X 1 = 10
*/
