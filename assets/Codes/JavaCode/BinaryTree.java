import java.util.Scanner; // Importing Scanner class for user input

public class BinaryTree { // Declaring a class named BinaryTree
    // Method to generate the binary tree pattern
    public static void pat(int n, String word) { // Method definition with parameters 'n' and 'word'
        int x = (int) (Math.pow(2, (n - 1))); // Calculate initial number of spaces for the first row
        int letter = 0; // Initialize variable to track characters in 'word'
        
        System.out.println(); // Print empty line to start new line in output
        
        int y = x / 2 - 1; // Calculate spaces for subsequent rows
        
        for (int i = 0; i < n - 1; i++) { // Loop for each row, excluding the first row
            // Print leading spaces for each row
            for (int j = 0; j < y; j++) {
                System.out.print(' ');
            }
            
            // Print characters from 'word' along with spaces
            for (int k = (int) (Math.pow(2, i)); k > 0; k--) {
                if (letter < word.length()) { // Check if there are more characters in 'word'
                    System.out.print(word.charAt(letter)); // Print character
                    letter++; // Move to next character in 'word'
                } else {
                    System.out.print(' '); // Print space if 'word' ends
                }
                
                // Print spaces between characters
                for (int l = 0; l < x; l++) {
                    System.out.print(' ');
                }
            }
            System.out.println(); // Move to next line
            x = y; // Update spaces for next row
            y /= 2; // Decrease spaces for subsequent rows
        }
    }

    // Method to translate a letter to Morse code
    static String Translate(char letter) { // Method definition with parameter 'letter'
        String morse = ""; // Initialize Morse code string
        
        // Switch statement to translate 'letter' to Morse code
        switch(letter){
            case 'e' -> morse = ".";
            case 't' -> morse = "_";
            case 'i' -> morse = "..";
            case 'a' -> morse = "._";
            case 'n' -> morse = "_.";
            case 'm' -> morse = "__";
            case 's' -> morse = "...";
            case 'u' -> morse = ".._";
            case 'r' -> morse = "._.";
            case 'w' -> morse = ".__";
            case 'd' -> morse = "_..";
            case 'k' -> morse = "_._";
            case 'g' -> morse = "__.";
            case 'o' -> morse = "___";
            case 'h' -> morse = "....";
            case 'v' -> morse = "..._";
            case 'f' -> morse = ".._.";
            case 'l' -> morse = "._..";
            case 'p' -> morse = ".__.";
            case 'j' -> morse = ".___";
            case 'b' -> morse = "_...";
            case 'x' -> morse = "_.._";
            case 'c' -> morse = "_._.";
            case 'y' -> morse = "_.__";
            case 'z' -> morse = "__..";
            case 'q' -> morse = "__._";
            case '5' -> morse = ".....";
            case '4' -> morse = "...._";
            case '3' -> morse = "...__";
            case '2' -> morse = "..___";
            case '+' -> morse = "._._.";
            case '1' -> morse = ".____";
            case '6' -> morse = "_....";
            case '=' -> morse = "_..._";
            case '/' -> morse = "_.._.";
            case '7' -> morse = "_.___";
            case '8' -> morse = "__.__";
            case '9' -> morse = "___._";
            case '0' -> morse = "____.";
        }
        
        return morse; // Return Morse code for 'letter'
    }

    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        String list = "*etianmsurwdkgohvf_l_pjbxcyzq__54_3___2__+____16=/____7___8_90__"; // String list for pattern
        
        pat(7, list); // Generate binary tree pattern
        
        System.out.println(); // Print empty line
        
        // Experimental: Translate a word into Morse code
        System.out.print("Enter the Word To Translate It in Morse Code: "); // Prompt user for input
        String word = sc.next(); // Read user input
        String ans = ""; // Initialize Morse code string
        
        // Loop through each character in 'word' and translate to Morse code
        for (int i = 0; i < word.length(); i++) {
            ans += Translate(word.charAt(i)) + " "; // Append Morse code to 'ans'
        }
        System.out.println(ans); // Print translated Morse code
        
        sc.close(); // Close Scanner object
    }
}
