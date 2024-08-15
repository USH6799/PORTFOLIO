public class ProofReader {
    public static void main(String[] args) {
        // Variables to store the number of pages read each week
        int week1 = 134;
        // 'week1' stores the number of pages read in the first week, which is 134.

        int week2 = 217;
        // 'week2' stores the number of pages read in the second week, which is 217.

        int week3 = 80;
        // 'week3' stores the number of pages read in the third week, which is 80.

        int week4 = 145;
        // 'week4' stores the number of pages read in the fourth week, which is 145.

        // Calculating the total number of pages read over four weeks
        int total = week1 + week2 + week3 + week4;
        // 'total' stores the sum of pages read in all four weeks.
        // Calculation: total = 134 + 217 + 80 + 145 = 576

        // Cost per page read by the proofreader
        int cost = 60;
        // 'cost' stores the payment amount per page read, which is 60 currency units per page.

        // Calculating the total payment based on the total number of pages read and the cost per page
        int totalPayment = cost * total;
        // 'totalPayment' stores the result of multiplying the total number of pages by the cost per page.
        // Calculation: totalPayment = 60 * 576 = 34560

        // Printing the total payment for reading the pages
        System.out.println("Total Payment For Reading " + total + " Pages is: " + totalPayment);
        // This statement prints out the total number of pages read and the corresponding payment.
    }   
}

/*
Dry Run Example:
1. Initialize variables:
   - week1 = 134
   - week2 = 217
   - week3 = 80
   - week4 = 145
   - cost = 60

2. Calculate the total number of pages:
   - total = week1 + week2 + week3 + week4
   - total = 134 + 217 + 80 + 145
   - total = 576

3. Calculate the total payment:
   - totalPayment = cost * total
   - totalPayment = 60 * 576
   - totalPayment = 34560

4. Output:
   - The program prints: "Total Payment For Reading 576 Pages is: 34560"

Explanation:
- The program calculates the total number of pages read over four weeks.
- It then multiplies this total by the cost per page to determine the total payment the proofreader will receive.
- In this example, the proofreader reads 576 pages in total, and at a rate of 60 currency units per page, they will receive a total payment of 34,560 currency units.
*/
