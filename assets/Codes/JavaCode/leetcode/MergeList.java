public class MergeList {

    // Recursive method to sort the array using Bubble Sort algorithm
    static int[] Sort(int arr[], int n) {

        // Base case: If the array is fully sorted (n == 0), return the array
        if (n == 0) {
            return arr;
        }

        // Bubble Sort step: Compare each adjacent pair and swap if out of order
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) { // If the current element is greater than the next
                int temp = arr[i + 1];  // Swap the elements
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Recursively call Sort for the next pass, with n reduced by 1
        return Sort(arr, n - 1);
    }

    public static void main(String[] args) {

        // Initialize two sorted lists
        int l1[] = {1, 2, 4};
        int l2[] = {1, 3, 4};

        // Initialize the merged list with a length equal to the sum of l1 and l2 lengths
        int l3[] = new int[l1.length + l2.length];

        // Merge l1 and l2 into l3
        for (int i = 0; i < l1.length + l2.length; i++) {

            if (i < l1.length) {  // Copy elements from l1 into the first part of l3
                l3[i] = l1[i];
            } else {  // Copy elements from l2 into the remaining part of l3
                l3[i] = l2[i - l1.length];
            }
        }

        // Sort the merged list
        Sort(l3, l3.length);

        // Print the sorted merged list
        for (int i = 0; i < l3.length; i++) {
            System.out.print(l3[i] + " | ");
        }
    }

    // Dry Run Example:
    // l1 = {1, 2, 4}
    // l2 = {1, 3, 4}
    // Step 1: Merge l1 and l2 into l3
    // l3 = {1, 2, 4, 1, 3, 4}
    //
    // Step 2: Sort l3 using Bubble Sort (recursive approach)
    // Pass 1: l3 = {1, 2, 1, 3, 4, 4}
    // Pass 2: l3 = {1, 1, 2, 3, 4, 4}
    // (No further swaps needed as the array is now sorted)
    //
    // Final Output: 1 | 1 | 2 | 3 | 4 | 4 |
}
