import java.util.Scanner;
//importing Scanner class For Input

public class Circle {
    //Classname Circle
    
    public static void main(String[] args) {
        //main method to run the code

        Scanner sc = new Scanner(System.in);
        //Creating object(sc) of Scanner class To take INput

        System.out.print("Enter The Radius: ");
        //Asking For Radius Of the Circle.

        double radius = sc.nextDouble();
        // Taking input of type double(decimal values) in the variable radius.

        double area = 3.14 * radius * radius;
        //in variable area , storing solution of (3.14 X radius X radius)

        double Circum = 2 * 3.14 * radius;
        //In Circum var , Storing solution of (2 X 3.14 X radius)

        System.out.println("area: " + area);
        // Printing area.

        System.out.println("Circum: " + Circum);
        //printing circumference

        sc.close();
        //closing Scanner class object So no more input can be taken.
        //Not Recommended.
        
    }   
}
