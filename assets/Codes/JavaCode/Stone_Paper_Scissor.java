import java.util.Scanner;
// imported scanner class for taking input from user.

public class Stone_Paper_Scissor {
    // classname Stone_Paper_Scissor

    static int Gen_random(){
        // A fnc named Gen_random of return type integer, this fnc generates a random number between 0 - 2 and returns it to caller.

        int num = (int) (Math.random() * 3);
        // uses Math.random() to generate a random number between 0.1 - 1.0 |

        // multipling the random number to get a value between 0.1 - 2.0 |

        // Type Casting(Explicit type conversion): '(int)' -> to convert the decimal value to integer and get a number between 0 and 2 without any decimal values.

        // storing the random generated number in variable num of integer type.

        // We are getting the random number in float data type and converting float in int needs explicit type conversion.

        return num;
        // returning the value of num to the caller.

    }// Gen_Random fnc ends here.

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter Your Choice[0 for Stone | 1 for Paper | 2 for Scissor]: ");
        // asking the user for input between 0 to 2 for the choice btw stone, paper and scissor.

        //Here, 0 represents Stone | 1 represents Paper | 2 represents Scissor.

        int choice = sc.nextInt();
        // taking the input btw 0 to 2 and storing it in variable 'choice' of datatype integer.

        if(choice < 3 && choice > -1){
            // if statement checks two conditions.

            // 1. if the value of var 'choice' or the input is below 3 or not.

            // 2. if the value of var 'choice' or the input is above -1 or not.

            // 1,2. In short, if the value of var 'choice' or the input is btw 0 to 2 or not.

            // the if code below will only run when both conditions are true because they have &&(and) btw them.

            int Comp_pick = Gen_random();
            // calling Gen_random() fnc through the variable Comp_pick (caller of fnc) of Data Type integer because the fnc is returning the value in integer datatype.

            // Gen_random() returns a random number btw 0 to 2 to the caller, here the caller was the variable 'Comp_pick' so the returned value will be stored in 'Comp_pick'.

            if (choice == 0 && Comp_pick == 0){
                // if statement checking 2 conditions joined with &&(and) In order to run the code inside 'if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 0 or not. 0 - Stone.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 0. 0 - Stone.

                System.out.println("Tie !");
                // printing Tie if both the conditions are true because stone and stone pick means tie.

            }// stone/stone pick 'if' ends here.

            else if (choice == 0 && Comp_pick == 1){ 
                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 0 or not. 0 - Stone.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 1. 1 - Paper.
                
                System.out.println("Computer Wins");
                // printing Computer wins if both the conditions are true.

                // Because in btw stone and paper pick, paper wons.

            }// stone/paper else if ends here.
            else if (choice == 0 && Comp_pick == 2){

                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 0 or not. 0 - Stone.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 2. 2 - Scissor.
                
                System.out.println("You Wins");
                // printing You wins if both the conditions are true.
                
                // Because in btw stone and Scissor pick, Stone wons.

            }// stone/scissor else if ends here.

            else if (choice == 1 && Comp_pick == 0){
                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 1 or not. 1 - Paper.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 0. 0 - Stone.
                
                System.out.println("You Wins");
                // printing You wins if both the conditions are true.
                
                // Because in btw paper and Stone pick, paper wons.

            }// paper/stone else if ends here.
            else if (choice == 1 && Comp_pick == 1){
                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 1 or not. 1 - Paper.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 1. 1 - Paper.

                System.out.println("Tie !");
                // printing tie if both the conditions are true.
                
                // Because in btw paper and paper pick, no one wons(tie).

            }// paper/paper else if ends here.

            else if (choice == 1 && Comp_pick == 2){
                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 1 or not. 1 - Paper.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 2. 2 - Scissor.
                
                System.out.println("Computer Wins");
                // printing Computer wins if both the conditions are true.
                
                // Because in btw Paper and Scissor pick, Scissor wons.

            }// paper/scissor else if ends here.

            else if (choice == 2 && Comp_pick == 0){
                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 2 or not. 2 - Scissor.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 0. 0 - Stone.

                System.out.println("Computer Wins");
                // printing Computer wins if both the conditions are true.
                
                // Because in btw Scissor and Stone pick, Stone wons.

            }// Scissor/stone else if ends here.

            else if (choice == 2 && Comp_pick == 2){
                // else if statement checking 2 conditions joined with &&(and) In order to run the code inside 'else if' , both the conditions have to be true.

                // 1. checks if player input or the value inside var 'choice' is equal to 2 or not. 2 - Scissor.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 2. 2 - Scissor.

                System.out.println("Tie !");
                // printing tie if both the conditions are true.
                
                // Because in btw Scissor and Scissor pick, no one wons(tie).

            }// scissor/scissor else if ends here.

            else{
                // else statement if above all if's are false or not run then the else code will run.

                // in reality, it checks the last condition if (choice == 2 && Comp_pick == 1).

                // 1. checks if player input or the value inside var 'choice' is equal to 2 or not. 2 - Scissor.

                // 2. checks if the Value inside Comp_pick or the random generated number is equal to 1. 1 - Paper.

                System.out.println("You Wins");
                // printing You wins if both the conditions are true.
                
                // Because in btw Scissor and paper pick, Scissor wons.

            }// Scissor/paper else code ends here.

        }// choice btw 0 - 2 if ends here.

        else{ 
            // else code will run if the 'if' condition will be false or the choice/input is not btw 0 and 2.

            System.out.println("You Choosed Wrong Option");
            // prints an error that it exceeds the limit.

        }// Error else code ends here.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

            }// main fnc closes here.

}// class ends here.
