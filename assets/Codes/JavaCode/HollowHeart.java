public class HollowHeart{
  // classname HollowHeart
    public static void main(String[] args){
      // main fnc to run the code.

    for(int i=0 ; i < 6 ; i++){
      // outer loop going from (i to 6 - 1) or (0 to 5)

        for(int j=0 ; j <= 6 ; j++){
          // inner loop going from (j to 6) or (0 to 6)

         if((i == 0 && j % 3 != 0)||(i == 1 && j % 3 == 0)||((i + j) == 8)||((i - j) == 2)){
          // condition in which the stars should be printed.

            System.out.print("*");
            // printing stars

            }// if closed.

         else{ //else code here.

            System.out.print(" ");
            // printing spaces.

            }// else code ends here.

        }// inner loop ends here.

        System.out.println();
        // printing rows 

    }// outer loop ends here.
  }
}

// Expected Output:-
        // j=0|j=1|j=2|j=3|j=4|j=5|j=6
      //i=1     *   *       *   *          
      //i=2 *           *           *    
      //i=3 *                       *
      //i=4     *               *    
      //i=5         *       *            
      //i=6             *                


