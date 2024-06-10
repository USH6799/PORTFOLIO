public class Bank_accounts {
    // classname Bank_accounts

    int acno;
    // variable to store account number of integer data type.

    int intial;
    // variable to store intial amount in the account , integer data type because the value are integers. 

    int tick;
    // variable tick to keep count of the no.of times the accounts were opened.

    double interest;
    // variable to store interest double data type because it may have decimal values.

    final double rate = 8.75;
    // varaible for storing rate of interest double data type because it contains decimal values. | final keyword used because the value of rate will not change anywhere.(not necessary)

    // function to create a account with acno.100 initial money: 25000 and counting increased by 1 because the function was runned once.
    
    public void account1() {

        //Not returning anything so void
        
        acno = 100;
        //storing 100 in acno var
        
        intial = 25000;
        //storing 25000 in intial var
        
        tick ++;
        // increasing the value of tick by 1.

    }
    
    // function to create a account with acno.100 initial money: 25000 and counting increased by 1 because the function was runned once.
    public void account2() {

        //Not returning anything so void

        acno = 010; 
        //storing 010 in acno var

        intial = 25000;
        //storing 25000 in intial var
        tick ++;
        // increasing the value of tick by 1.

    }

    // a function to update the inital amount by the rate of interest given.

    void Update(){
        // not returning anything so void

        interest = (intial * rate * 1) / 100;
        // variable interest to store the interest produced on the initial amount(initial) . at rate of interest (rate),

        intial += interest;
        // increasing value of intial by the interest
        // [initial += interest] ---> [initial = initial + interest]

    }

    // function to print the Details of the Account.

    public void details(){
        // void because it is not returing anything.

        System.out.println("For Account no." + acno + ",The Interest Is: " + interest);
        // printing the account no. and interest.

        System.out.println("The Total Balance Was: " + intial);
        // printing the final amount.
    }

    // a function to check how many times the aacounts were beinged opened.
    void count(){

        System.out.println("The Accounts Were Opened " + tick + " Times.");
        // printing the no.of times the accounts were opened.
    }


    public static void main(String[] args) {
        // main fnc to run the code.

        Bank_accounts acc1 = new Bank_accounts(); 
        // creating an object of Bank_accounts name: acc1 .

        acc1.account1();
        // accessing function of Bank_accounts class through object(acc1) .
        
        acc1.Update();
        // accessing function of Bank_accounts class through object(acc1) .

        acc1.details();
        // accessing function of Bank_accounts class through object(acc1) .

        acc1.count();
        // accessing function of Bank_accounts class through object(acc1) .

        // creating another object of Bank_accounts name: acc2 .
        Bank_accounts acc2 = new Bank_accounts();

        acc2.account2();
        // accessing function of Bank_accounts class through object(acc2) .
        acc2.Update();
        // accessing function of Bank_accounts class through object(acc2) .

        acc2.details();
        // accessing function of Bank_accounts class through object(acc2) .
        
        acc2.count();
        // accessing function of Bank_accounts class through object(acc2) .
    }
}
