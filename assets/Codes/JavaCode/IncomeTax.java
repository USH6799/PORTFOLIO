import java.util.Scanner;
// imported scanner class for taking input from user.

public class IncomeTax {
    // classname IncomeTax.

    public static void main(String[] args) {
        // main fnc to run the code.
        
        Scanner sc =new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        System.out.print("What is Your Income[In Lakhs]: ");
        // asking for the income in lakhs...

        double income = sc.nextDouble();
        // storing the income in variable 'income' of datatype double because it may contain decimal values.

        double tax = 0;
        // a variable to store the Income Tax got on income storing i variable tax with initial value as 0.

        if(income > 2.5 && income <= 5.0){
            // if condition to check if the income is btw 2.5 lakh - 5 lakh or equal to 5 lakh, and if it is true the below code will execute and if it is false then next if will run.
            
            tax += 0.05 * (income - 2.5);
            // Expanded-> tax = tax + 5% of (income - 2.5 lakh).
            // Storing the answer of this solution in var tax.

            // Explanation:- the tax paid by the person will be on the remaining money after 2.5 lakh because the income below 2.5 lakh have to give 0 as tax. 

            // So the 5% tax will be on total income - 2.5 lakh. 
            
        }// 5% tax if ends here.
        
        else if(income > 5.0 && income <= 10.0){
            // another if, to check if the income is btw 5 lakh - 10 lakh or equal to 10 lakh, and if it is true they have to pay 20% tax and the below code will execute. otherwise next if will run.
            
            tax += 0.05 * (5.0 - 2.5);
            // Expanded-> tax = tax + 5% of (5 lakh - 2.5 lakh).

            // Storing the answer of this solution in var tax.

            // Explanation:- the tax paid by the person will be on the the maximum money on which the 5% tax will be applied(i.e. 5 lakh) after 2.5 lakh reduced because the income below 2.5 lakh have to give 0 as tax. 
            
            // So the 5% tax will be on 5 lakh - 2.5 lakh. 

            tax += 0.2* (income - 5);
            // Expanded-> tax = tax + 20% of (income - 5 lakh).

            // Storing the answer of this solution in var tax.

            // Explanation:- the tax paid by the person will be on the remaining money after 5 lakh because the income below 5 lakh have to give 5% as tax and the person has already given it in the above code. 
            
            // So the 20% tax will be on total income - 5 lakh. 

        }// 20% tax if ends here.

        else if(income > 10.0){
            // another if, it will run when income is abover 10 lakhs otherwise else code will run.

            tax += 0.05 * (5.0 - 2.5);
            // Expanded-> tax = tax + 5% of (5 lakh - 2.5 lakh).

            // Storing the answer of this solution in var tax.

            // Explanation:- the tax paid by the person will be on the the maximum money on which the 5% tax will be applied(i.e. 5 lakh) after 2.5 lakh reduced because the income below 2.5 lakh have to give 0 as tax. 
            
            // So the 5% tax will be on 5 lakh - 2.5 lakh. 

            tax += 0.2 * (10.0 - 5.0);
            // Expanded-> tax = tax + 20% of (10 lakh - 5 lakh).

            // Storing the answer of this solution in var tax.

            // Explanation:- the tax paid by the person will be on the maximum money on which the tax will be applied(i.e. 10 lakhs) after 5 lakh reduced because the income below 5 lakh have to give 5% as tax and the person has already given it in the above code. 
            
            // So the 20% tax will be on 10 lakh - 5 lakh. 

            tax += 0.3 * (income - 10.0);                              
            // Expanded-> tax = tax + 30% of (income - 10 lakh).

            // Storing the answer of this solution in var tax.

            // Explanation:- the tax paid by the person will be on remaining moeny after 10 lakh reduced because the income below 10 lakh have to give 20% as tax and the person has already given it in the above code. 
            
            // So the 30% tax will be on total income - 10 lakh. 
            
        }// 30% tax if ends here.

        else{
            // if the income is below 2.5 lakh then the else code will run.
            
            tax = 0;
            // the person who has income below 2.5 lakh have to pay no tax.

        }// 0% tax else ends here.
        
        System.out.println("The Tax Should Be Payed By the Employee Is: " + tax + " Lakhs");
        // printing the total amount of income tax paid by the employee on his income.

        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.

    }// main fnc closes here.
    
}// class ends here.
