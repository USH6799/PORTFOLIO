import java.util.Scanner;
// importing Scanner class For taking input.

public class Min_Price {
    // classname Min_Price
    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object sc for taking input.

        System.out.print("Enter The Enrollment Price: ");
        // Asking for enrolled price.

        double enroll = sc.nextDouble();
        // taking the input of type double (Decimal values) Storing the input in var enroll.

        System.out.print("Enter The Closing Price: ");
        // Asking For Closing price to find minimum.

        double close_price = sc.nextDouble();
        // taking the input of type double (Decimal values) Storing the input in var close_price.

        double Purchase_price = Math.min(enroll, close_price);
        // Storing the minimum of enroll price and closing price in Purchased_price variable of same data type.

        System.out.println("The Purchase Price Was: " + Purchase_price);
        // printing the minimum as purchased price.

        sc.close();
        // Closing scanner object so that no input can be taken .(not neccesary). 

    }   
}
