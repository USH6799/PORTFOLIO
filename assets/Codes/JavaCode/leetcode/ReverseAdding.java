public class ReverseAdding {

    public static void main(String[] args) {

        // Two arrays representing numbers in reverse order (e.g., 342 and 465)
        int l1[] = {2, 4, 3}; // Represents the number 342
        int l2[] = {5, 6, 4}; // Represents the number 465

        // Convert the arrays to strings by appending each digit (correct approach)
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i : l1) {
            str1.append(i);  // Append each digit from l1 to str1
        }

        for (int i : l2) {
            str2.append(i);  // Append each digit from l2 to str2
        }

        // Reverse the strings and parse them to integers
        int num1 = Integer.parseInt(Reverse(str1.toString(), str1.length() - 1)); // Reverse and parse str1
        int num2 = Integer.parseInt(Reverse(str2.toString(), str2.length() - 1)); // Reverse and parse str2

        // Add the two numbers
        int sum = num1 + num2;

        // Reverse the sum back to match the problem's format
        String ans = Reverse(Integer.toString(sum), Integer.toString(sum).length() - 1);

        // Convert the reversed sum string to an integer array
        int arr[] = new int[ans.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(ans.charAt(i));  // Convert each character back to an integer
            System.out.print(arr[i] + " ");  // Print each integer
        }
    }

    // Recursive method to reverse a string
    static String Reverse(String str, int i) {
        // Base case: If index is -1, return an empty string
        if (i == -1) {
            return "";
        }

        // Return the current character and call Reverse on the remaining part of the string
        return str.charAt(i) + Reverse(str, i - 1);
    }

    // Dry Run:
    // Input: l1 = {2, 4, 3} and l2 = {5, 6, 4}
    // Step 1: Convert l1 and l2 to strings str1 = "243" and str2 = "564"
    // Step 2: Reverse str1 to get "342" and reverse str2 to get "465"
    // Step 3: Parse "342" and "465" to integers and add them: 342 + 465 = 807
    // Step 4: Reverse the sum "807" to get "708"
    // Step 5: Convert "708" to an integer array arr = {7, 0, 8} and print it
    // Final Output: 7 0 8
}
