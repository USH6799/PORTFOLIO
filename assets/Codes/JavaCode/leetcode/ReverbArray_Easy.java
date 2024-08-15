// Question was to create a fnc that reverses the string s and returns it but the string is in array type at which characters of the string are the parts of Array.

// Input:- s = ['h' , 'e' , 'l' , 'l' , 'o']

// OUTPUT:- ['o', 'l', 'l', 'e', 'h']

import java.util.Scanner;

public class ReverbArray_Easy {

    // Method to reverse the array of characters
    static char[] Reverse(char[] word) {
        // Initialize a new array to store the reversed characters
        char newarr[] = new char[word.length];

        // Loop through the original array from the end to the beginning
        for (int i = word.length - 1; i >= 0; i--) {
            // Fill the new array with characters from the original array in reverse order
            newarr[word.length - 1 - i] = word[i];
        }

        // Return the reversed array
        return newarr;
    }

    public static void main(String[] args) {
    
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the String to Reverse it: ");
        String s = sc.nextLine();

        // Convert the input string to a character array
        char[] arr = s.toCharArray(); 

        // Reverse the array and print the result
        System.out.println(Reverse(arr));

        // Close the Scanner
        sc.close();
    }

    // Dry Run:
    // Input: "hello"
    // Step 1: Convert the string "hello" to a character array arr = ['h', 'e', 'l', 'l', 'o']
    // Step 2: Reverse the array:
    // - i = 4: newarr[0] = 'o'
    // - i = 3: newarr[1] = 'l'
    // - i = 2: newarr[2] = 'l'
    // - i = 1: newarr[3] = 'e'
    // - i = 0: newarr[4] = 'h'
    // Step 3: Output the reversed array ['o', 'l', 'l', 'e', 'h']
}

