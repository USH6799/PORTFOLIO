import java.util.Scanner;

public class Alphabets {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the input word from the user
        String word = sc.next();

        // Initialize an empty string to store the sorted characters
        String ans = "";

        // Loop until the word is empty
        while (word.length() != 0) {
            // Assume the first character is the smallest
            char min = word.charAt(0);

            // Find the smallest character in the remaining word
            for (int j = 0; j < word.length(); j++) {
                char x = word.charAt(j);

                // Compare the current character with the minimum character found so far
                int diff = Character.toString(x).compareToIgnoreCase(Character.toString(min));

                // Update the minimum character if a smaller one is found
                if (diff < 0) {
                    min = x;
                }
            }

            // Remove the first occurrence of the smallest character from the word
            word = word.replaceFirst(Character.toString(min), "");

            // Append the smallest character to the result string
            ans += min;

            // Dry Run Example:
            // Input: "banana"
            // First Iteration:
            //   word = "banana"
            //   min = 'b'
            //   Compare each character:
            //     'a' < 'b', so min = 'a'
            //   Remove first 'a': word = "bnana"
            //   ans = "a"
            //
            // Second Iteration:
            //   word = "bnana"
            //   min = 'b'
            //   Compare each character:
            //     'a' < 'b', so min = 'a'
            //     (Another 'a' will also be considered here)
            //   Remove first 'a': word = "bnana" -> "bnna"
            //   ans = "aa"
            //
            // Third Iteration:
            //   word = "bnna"
            //   min = 'b'
            //   Compare each character:
            //     'n' > 'b', so min remains 'b'
            //   Remove first 'b': word = "nna"
            //   ans = "aab"
            //
            // Continue until word is empty:
            //   word = "nna" -> "na" -> "n"
            //   ans = "aabnn"

        }

        // Output the sorted characters
        System.out.println(ans);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
