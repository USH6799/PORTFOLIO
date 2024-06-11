public class ProofReader {
    public static void main(String[] args) {
        // Variables to store the number of pages read each week
        int week1 = 134;
        int week2 = 217;
        int week3 = 80;
        int week4 = 145;

        // Calculating the total number of pages read over four weeks
        int total = week1 + week2 + week3 + week4;

        // Cost per page read by the proofreader
        int cost = 60;

        // Calculating the total payment based on the total number of pages read and the cost per page
        int totalPayment = cost * total;

        // Printing the total payment for reading the pages
        System.out.println("Total Payment For Reading " + total + " Pages is: " + totalPayment);
    }   
}
