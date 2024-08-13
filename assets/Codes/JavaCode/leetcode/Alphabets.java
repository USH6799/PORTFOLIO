import java.util.Scanner;

public class Alphabets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String ans = "";

        while(word.length() != 0) {

            char min = word.charAt(0);

            for (int j = 0; j < word.length() ; j++) {

                char x = word.charAt(j);

                int diff = Character.toString(x).compareToIgnoreCase(Character.toString(min));
                
                if (diff < 0) {

                    min = x;
                                
                }
                
            }
            
            word = word.replaceFirst(Character.toString(min), "");

            ans += min;           

        }

        System.out.println(ans);

    }
}
