import java.util.*;
// importing Scanner Class For input.

public class butterfly {
	// classname butterfly
	public static void main(String[] args){
		// main fnc to run the code.

		Scanner sc = new Scanner(System.in);
		// Scanner obj sc for taking input.

		int n = sc.nextInt();
		// taking input the length of the pattern in variable n 

		for(int i = 1 ; i <= n ; i++){
			// outer loop(X) going from 1 to n (i to n)

			for(int j = 1 ; j <= i ; j++){
				// inner loop(A) running from (j to i).

				System.out.print("*");
				// printing * .

			}// inner loop(A) ends here.

			int space = 2 * (n - i);
			// creating a var space storing the value of solution (2 * n - i).

			for(int j = 1 ; j <= space ; j++){
				// inner loop(B) running from (j to space).

				System.out.print(" ");	
				// printing spaces(" ") or nothing.

		   	}// inner loop(B) ends here

			for(int j = 1 ; j <= i ; j++){
				// inner loop(C) going from (j to i).

				System.out.print("*");
				// printing stars * .

			}// inner loop(C) ends here

			System.out.println();
			// printing nothing used to move the cursor to the next line.

		}// outer loop(X) ends here

	for(int i = n ; i >= 1 ; i--){
		// outer loop(Y) going from (i to 1) where i = n .

		for(int j = 1 ; j <=i ; j++){
			// inner loop(D) going from (j to i).

			System.out.print("*");
			// printing stars(*) .
		}// inner loop(E) ends here
		

		int space = 2*(n-i);
		// creating var space for storing answer of solution 2 * (n - i) .

		for(int j = 1;j<=space;j++){
			// inner loop(E) going from ( j to space)

			System.out.print(" ");	
			// printing spaces
			
		}// inner loop(E) ends here

		for(int j = 1 ; j <= i ; j++){
			// inner loop(F) going from (j to i).

			System.out.print("*");
			// printing stars *

		}// inner loop(F) ends here.

		System.out.println();
		// printing nothing used to move the cursor to the next line.

	}// outer loop(Y) ends here.

	sc.close();
	// closing scanner object so no further input can be taken.
	
	}
}
