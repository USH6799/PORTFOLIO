import java.util.Scanner; 
// Importing Scanner class for user input

public class EvilNumber { 
// Declaring a public class named 'EvilNumber'

    int num; 
    // Declaring an integer variable 'num' to store the user input number

    String binary; 
    // Declaring a String variable 'binary' to store the binary equivalent of the number

    EvilNumber(){ 
    // Constructor to initialize 'num' to 0 and 'binary' to an empty string

        num = 0; 
        // Initializing 'num' to 0

        binary = ""; 
        // Initializing 'binary' to an empty string

    } 

    void Input(){ 
    // Method to take input from the user

        Scanner sc = new Scanner(System.in); 
        // Creating a Scanner object 'sc' to read input from the console

        System.out.print("Enter a number: "); 
        // Prompting the user to enter a number

        num = sc.nextInt(); 
        // Storing the input number in 'num'

    } 

    void ToBinary(){ 
    // Method to convert the number to its binary equivalent

        int temp = num; 
        // Storing the value of 'num' in a temporary variable 'temp'

        while(temp != 0){ 
        // Loop to calculate binary representation by repeatedly dividing by 2

            binary = (temp % 2) + binary; 
            // Calculating remainder when 'temp' is divided by 2 and appending it to 'binary'

            temp = temp / 2; 
            // Updating 'temp' by dividing it by 2

        } 

    } 

    void Check(){ 
    // Method to check if the number is an Evil number

        int c = 0; 
        // Declaring a counter variable 'c' to count the number of 1's in the binary representation

        for(int i = 0 ; i < binary.length() ; i++){ 
        // Looping through each character in the binary string

            if(binary.charAt(i) == '1'){ 
            // Checking if the current character is '1'

                c++; 
                // Incrementing the counter if the character is '1'

            } 

        } 

        if(c % 2 == 0){ 
        // Checking if the count of 1's is even

            System.out.println(num + " is a Evil Number"); 
            // Printing that the number is an Evil Number

        } else { 
        // If the count of 1's is odd

            System.out.println(num + " is not a Evil Number"); 
            // Printing that the number is not an Evil Number

        } 

    } 

    public static void main(String[] args) { 
    // Main method to execute the program

        EvilNumber obj = new EvilNumber(); 
        // Creating an object 'obj' of the class 'EvilNumber'

        obj.Input(); 
        // Calling the 'Input' method to get user input

        obj.ToBinary(); 
        // Calling the 'ToBinary' method to convert the number to binary

        obj.Check(); 
        // Calling the 'Check' method to determine if the number is an Evil number

    } 

} 
