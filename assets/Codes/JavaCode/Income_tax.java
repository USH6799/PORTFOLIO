public class Income_tax {
    // classname Income_tax

    public static void main(String[] args) {
        // main fnc to run the code.

        int income = 1223423;  
        // variable 'income' storing the total income of the person i.e., Rs.1223423

        // Integer Datatype because it doesn't contain any floating/decimal values.

        int tax_inc = income - 300000;
        // the income upto 3 lakhs doesn't have any tax, so the taxable income will be on total income - 3 lakhs.

        // storing the value of money excluding non-taxable income(3 lakhs) in variable 'tax_inc' of datatype integer.
        
        // Integer Datatype because it doesn't contain any floating/decimal values.

        double tax = (0.15 * tax_inc);
        // tax will be of 15% or 15/100 -> 0.15

        // the tax will be on taxable amount ie. On value of var 'tax_inc' .

        // storing the 15% of 'tax_inc' in variable 'tax' of datatype double.

        // double dataype because it may contain decimal values.

        System.out.println("The Tax on Income (Rs." + income + ") Was: Rs." + tax);
        // printing the Total Tax on in his actual income or the total income.

    }// main fnc closes here.

}// class ends here.
