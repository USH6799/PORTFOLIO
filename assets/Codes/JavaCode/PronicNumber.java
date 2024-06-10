import java.util.Scanner;  // Importing Scanner class to read input from the user


public class PronicNumber {  // Declaring the class PronicNumber

    public static void main(String[] args) {  // Main method, the entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to read input from the user
        
        System.out.print("Enter a number: ");  // Prompting the user to enter a number
        
        int num = sc.nextInt();  // Reading the integer input from the user and storing it in variable 'num'
        

        for(int i = 1 ; i < num ; i++){
            if(i * (i+1) == num){
                // if the multiplication od 'i' and its consecutive number 'i+1' is equal to the actual number then it is a pronic number.
                

                System.out.println(num + " is a pronic number.");  // If true, print that the number is a pronic number
                

                System.exit(0);
                // Terminates the Whole program at once.
                

            }

        }
            System.out.println(num + " is not a pronic number.");  // If false, print that the number is not a pronic number
            

        sc.close();  // Closing the Scanner object
        
    }
}

/*
Dry Run:
Input: 12

Step 1: Check if the number can be expressed as i * (i + 1)
i = 0: 0 * 1 = 0
i = 1: 1 * 2 = 2
i = 2: 2 * 3 = 6
i = 3: 3 * 4 = 12 (matches input number)

12 is a pronic number.
*/
