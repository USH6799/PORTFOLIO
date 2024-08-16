import java.util.Scanner;

/**
 * AlternateReverse class that alternates between reversing and keeping words as is.
 */
public class AlternateReverse {

    // Instance variables to store the original string and the result
    String str, res;

    // Constructor initializes the variables
    AlternateReverse() {
        str = "";
        res = "";
    }

    // Method to take input from the user
    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sentence Below: ");
        
        // Read the entire sentence
        str = sc.nextLine();

        // Add a space at the end to handle the last word properly
        str += " ";

        // Close the scanner
        sc.close();
    }

    // Method to reverse a word
    String Rev(String w) {
        // Initialize an empty string to store the reversed word
        String ans = "";
        
        // Reverse the word character by character
        for (int i = 0; i < w.length(); i++) {
            ans = w.charAt(i) + ans;
        }

        return ans;
    }

    // Method to alternate between reversing and not reversing words
    void Alternate(boolean odd) {
        // Iterate over the entire string
        for (int i = 0; i < str.length(); i++) {
            // Check for space to identify the end of a word
            if (str.charAt(i) == ' ') {

                String word = str.substring(0, i);
                String remain = str.substring(i + 1);

                if (odd) {
                    // Reverse the word and add to the result if odd
                    res += Rev(word) + " ";
                    // Update the string by removing the processed word
                    str = remain;
                    
                    // Set odd to false for the next word
                    odd = false;
                } else {
                    // Skip reversing and just update the string
                    res += word + " ";
                    // Update the string by removing the processed word
                    str = remain;
                    // Set odd to true for the next word
                    odd = true;
                }

                // Reset the index to start at the beginning of the next word
                i = -1;
            }
        }
    }

    // Method to display the result
    void Display(){
        System.out.println(res);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of AlternateReverse
        AlternateReverse obj = new AlternateReverse();

        // Take input from the user
        obj.Input();

        // Process the input to alternate between reversing words
        obj.Alternate(false);

        // Display the final result
        obj.Display();
    }

    // Dry Run Example:
    // Input: "Hello world this is Java"
    // Step 1: Initial string: "Hello world this is Java "
    // Step 2: First word "Hello" is kept as is (even word): res = "Hello "
    // Step 3: Second word "world" is reversed: res = "Hello dlrow "
    // Step 4: Third word "this" is kept as is (even word): res = "Hello dlrow this "
    // Step 5: Fourth word "is" is reversed: res = "Hello dlrow this si "
    // Step 6: Fifth word "Java" is kept as is (even word): res = "Hello dlrow this si Java "
    // Final Output: "Hello dlrow this si Java"
}
