import java.util.Scanner;
// imported scanner class for taking input from user.

public class Result {
    // classname Result

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc =new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter The Marks Of the 1st Subject: ");
        // asking for the marks of the first subject.

        int mark1 = sc.nextInt();        
        // taking input of the marks of 1st subject and storing the value in mark1 variable of type integer.

        System.out.print("Enter The Marks Of the 2nd Subject: ");
        // asking for the marks of the Second subject.

        int mark2 = sc.nextInt();    
        // taking input of the marks of 2nd subject and storing the value in mark2 variable of type integer.    

        System.out.print("Enter The Marks Of the 3rd Subject: ");
        // asking for the marks of the third subject.

        int mark3 = sc.nextInt();
        // taking input of the marks of 3rd subject and storing the value in mark3 variable of type integer.    

        float average = (mark1 + mark2 + mark3) / 3.0f;    
        // adding all marks and dividing them by 3 to find the average, 

        // average = total sum of items / total no. of items

        // Storing the average in variable 'average' of datatype float because it may contain decimal values also.

        if(average >= 40.0f && mark1 >= 33 && mark2 >= 33 && mark3 >= 33){
        // if condition to check 4 conditions:

        // 1. The value stored in var 'average' or the average of marks is more than or equal to 40% or not.

        // 2/3/4. If the marks in each subject is more than or equal to 33 marks or not.
        
        // the below code of if statement will run when both the above condition becomes true. otherwise else code will run.

            System.out.println("You Passed");
            // printing that the student is pass.

        }// if ends here

        else{
            // else condition runs if 'if' condition will be false.

            System.out.println("You Failed");
            // printing that that the student is fail.

        }// else codes ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.

}// class ends here.
