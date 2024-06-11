public class SI {
    // classname SI
    public static void main(String[] args) {
        // main function to run the Code.

        double p = 20000;
        // principal price stored in variable p | Datatype: double(for decimal values)

        double r = 13.5;
        // Rate of Interest stored in variable p=r | Datatype: double(for decimal values)

        int t = 4;
        // Time in Years stored in variable t | Datatype: int(for Integers values)

        // Basic formula of finding si = (principal X rate X time) / 100 .
        double interest = (p * r * t) / 100;
        // Storing Value of interest find out by using formula in variable interest (type:double because the solution is also is in double data type)

        System.out.printf("Simple Interest: " + interest);
        // printing the interest .
    }
}
