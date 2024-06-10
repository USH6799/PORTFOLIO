public class Reverb_multiply_ten_table {
    public static void main(String[] args) {
        // Setting the value of 'n' to 10
        int n = 10;
        
        // Looping from 10 down to 1
        for (int i = 10; i >= 1; i--) {
            // Printing the multiplication table of 10 in reverse order
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }

    }
}
