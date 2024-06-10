/**
 * UnaryTest
 */
public class UnaryTest {

    public static void main(String[] args) {
        // main method to run the code.

        int result = +1;
        // variable result storing integer data type value +1 = (1).

        System.out.println(result);
        // printing value of result. {result = 1} .

        result --;
        // Decreasing Value of result variable by 1 So, [result = 1] --> [result = 0] .
        
        System.out.println(result);
        // printing the vlaue of result variable {result = 0} .
        
        result ++;
        // Increasing Value of result variable by 1 So, [result = 0] --> [result = 1] .

        System.out.println(result);
        // printing the value of result. {result = 1} .

        result = -result;
        // redefining result variable value with negative(-) result value.
        // So result = 1 --> -result = (-) X 1 .
        // result = -1 .

        System.out.println(result);
        // printing the value of result {result = -1}.
        
        boolean success = false; 
        // A boolean(true or false) type varibale names success storing false. [success = false].

        System.out.println(success);
        // printing the value of success. (success = false).

        System.out.println(!success);
        // printing the Value of not(!) success means opposite of success variable value.
        // success = false --> !success = true (opposite of false).
        
    }
}