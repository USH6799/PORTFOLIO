public class Division {
    // classname Division.

    public static void main(String[] args) {
        // main method to run the Code.

        int num1 = 153;
        // variable num1 storing integer data type value = 153.
        
        int num2 = 22;
        // variable num2 storing integer data type value = 22.
        
        System.out.println("Quotient of 153 / 22: " + (num1 / num2));
        // printing the value of quotient formed by the division of num1 and num2 (153 / 22).
        // Quotient will be the integer part of the division result (ignores the decimal part).
        
        System.out.println("Remainder of 153 / 22: " + (num1 % num2));
        // printing the value of Remainder formed by the division of num1 and num2 (153 / 22).
        // Remainder is the part left over after the division.
        
    }
}

/////////////////////////////////

/*
Dry Run Example:
1. Initialize variables:
   - num1 = 153
   - num2 = 22

2. Perform Division to calculate Quotient:
   - Quotient = num1 / num2
   - Quotient = 153 / 22
   - Quotient = 6 (since 153 divided by 22 gives 6 as the integer part)

3. Perform Division to calculate Remainder:
   - Remainder = num1 % num2
   - Remainder = 153 % 22
   - Remainder = 21 (since 22 * 6 = 132, and 153 - 132 = 21)

4. Output:
   - Print: Quotient of 153 / 22: 6
   - Print: Remainder of 153 / 22: 21
*/
