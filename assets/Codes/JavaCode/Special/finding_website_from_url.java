package Special;
import java.util.Scanner;
// imported scanner class for taking input from user.

public class finding_website_from_url {
    // classname finding_website_from_url

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("Enter The Url: ");
        // asking for the Url.

        String Url = sc.next();
        // Storing the url in the var 'Url' of type string and used .next() to take only the first word as input.

        sc.close();
        // use of Scanner class is Over.

        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

        if (Url.endsWith(".com")){
            // checking if the input taken in the var Url having .com in its end. bcoz.. .com -> Commericial.

            // uses .endsWith() fnc to check the last letters of the input and match it with the suffix and it always returns either true or false.

            System.out.println(Url + " Is a Commercial Website");
            // printing the type of website of the Url.

        }// .com if ends here.

        else if (Url.endsWith(".org")){
            // applying another if , this only execute when the first if statement will be false otherwise it will not run.

            // This time checking .org in the last letters of var Url. Bcoz.. .org -> Organization.

            // uses .endsWith() fnc to check the last letters of the input and match it with the suffix and it always returns either true or false.

            System.out.println(Url + " Is an Organisation Website");
            // printing the type of website of the url.

        }// .org if ends here.

        else if (Url.endsWith(".in")){
            // another if for .in , this will also only execute when the above two are false otherwise this if will not run.

            // this time checking for .in in the last letters of var Url. Bcoz.. .in -> Indian.

            // uses .endsWith() fnc to check the last letters of the input and match it with the suffix and it always returns either true or false.

            System.out.println(Url + " Is an Indian Website");
            // printing the type of website of the url.

        }// .in if ends here.

        else{
            // the else part, this is the special part which will only run if all the given if statements are false, otherwise it will not execute.

            System.out.println(Url + " Is an Unknown Website");
            // this time it displays that it is an unknown type of url.

        }// else part ends here.

    }// main fnc closes here.

}// class ends here.
