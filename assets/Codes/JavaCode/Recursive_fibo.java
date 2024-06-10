public class Recursive_fibo {
    static void fibo(int a ,int b ,int n){
        // Define a static method named 'fibo' that takes three integer parameters: 'a', 'b', and 'n'.
        
        if(n == 0){
            // Base case: If 'n' is equal to 0, terminate the recursion.
            return;
        }
        
        int c = a + b;
        // Calculate the next Fibonacci number by adding 'a' and 'b'.
        
        a = b;
        // Update the value of 'a' to the current value of 'b'.
        
        b = c;
        // Update the value of 'b' to the current Fibonacci number 'c'.
        
        System.out.print(c + "\t");
        // Print the current Fibonacci number.
        
        fibo(a, b, n - 1);
        // Recursive call: Call the 'fibo' method with updated 'a', 'b', and decreased 'n'.
    }
    
    public static void main(String[] args) {
        // Define the main method.
        
        int x = 0;
        // Initialize a variable 'x' with the value 0.
        
        int y = 1;
        // Initialize a variable 'y' with the value 1.
        
        System.out.print(x + "\t" + y + "\t");
        // Print the initial two Fibonacci numbers.
        
        fibo(x, y, 4);
        // Call the 'fibo' method to generate the next 4 Fibonacci numbers starting from 'x' and 'y'.
    }
    
}


/*
Dry Run:
1. In the main method, 'x' is initialized as 0 and 'y' as 1. The initial Fibonacci numbers 0 and 1 are printed.

2. Call fibo(0, 1, 4)
   - Inside fibo: a = 0, b = 1, n = 4
     - Calculate c = 0 + 1 = 1
     - Update: a = 1, b = 1
     - Print 1
     - Call fibo(1, 1, 3)
       - Inside fibo: a = 1, b = 1, n = 3
         - Calculate c = 1 + 1 = 2
         - Update: a = 1, b = 2
         - Print 2
         - Call fibo(1, 2, 2)
           - Inside fibo: a = 1, b = 2, n = 2
             - Calculate c = 1 + 2 = 3
             - Update: a = 2, b = 3
             - Print 3
             - Call fibo(2, 3, 1)
               - Inside fibo: a = 2, b = 3, n = 1
                 - Calculate c = 2 + 3 = 5
                 - Update: a = 3, b = 5
                 - Print 5
                 - Call fibo(3, 5, 0)
                   - Inside fibo: a = 3, b = 5, n = 0
                     - Base case reached, return from fibo(3, 5, 0)
                 - Return from fibo(3, 5, 0)
             - Return from fibo(2, 3, 1)
         - Return from fibo(1, 2, 2)
     - Return from fibo(1, 1, 3)
 - Return from fibo(0, 1, 4)
*/

// OUTPUT:  0	1	1	2	3	5	

