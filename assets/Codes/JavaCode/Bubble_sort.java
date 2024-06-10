import java.util.Scanner;
// importing scanner class for input .

public class Bubble_sort{
    // classname Bubble_sort
    public static void main(String[]args){
        // main fnc to run the code.

       Scanner sc=new Scanner(System.in);
       // Creating object(sc) of Scanner class to take input.

       System.out.print("How many numbers You want to Sort?: ");
       // Asking the total no. of items to sort

       int n = sc.nextInt();
       //taking input of the length of the items throught sc object in the variable n .

       int arr[] = new int[n];
       // creating array(arr) of length n .

       for(int i = 0 ; i < n ; i++){
        // loop going from (i to n - 1) where i = 0.

        System.out.println("Enter the " + (i + 1) + ". number: ");
        // asking for the numbers to sort from 1st number to nth number.

        arr[i]=sc.nextInt();
        // taking the numbers as input and storing them in array (0 to n) .

        }// loop ends here.

       for(int i = 0 ; i < arr.length ; i++){
        // outer loop going from(i to arr.length) where i = 0 and arr.length = n . 

           for(int j = 0 ; j < arr.length - i - 1 ; j++){
            // inner loop goinf from (j to arr.length - i - 1) where j = 0 and arr.length - i - 1 = n - i - 1 .

                if(arr[j] > arr[j + 1]){
                    // checking if the value of arr[j] is greater than the value of arr[j + 1] .

                    int temp = arr[j + 1];
                    // storing the value of arr[j + 1] in variable temp.

                    arr[j + 1] = arr[j];
                    // storing the value of arr[j] in arr[j + 1].

                    arr[j] = temp;
                    // storing the value of temp in arr[j].

                    // by the above three codes , the position of arr[j] and arr[j + 1] interchanged.

                }// if ends here.

            } // inner loop ends here. 
        } // outer loop ends here. 
        
       for(int i = 0 ; i < arr.length ; i++){
        // loop going from (i to arr.length)

           System.out.print(arr[i]+" ");
           // printing the value of arr[i].

       }// loop ends here.
           
           sc.close();
           // closing Scanne robj so no further input can be taken (Not Necessary)
           
    }
}