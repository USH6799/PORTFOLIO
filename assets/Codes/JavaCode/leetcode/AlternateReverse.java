import java.util.Scanner;

/**
 * AlternateReverse
 */
public class AlternateReverse {

    String str, res;

    AlternateReverse() {
        str = "";
        res = "";
    }

    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sentence Below: ");

        str = sc.nextLine();

        str += " ";

        sc.close();
    }

    String Rev(String w) {
        String ans = "";
        for (int i = 0; i < w.length(); i++) {
            ans = w.charAt(i) + ans;
        }

        return ans;
    }

    void Alternate(boolean odd) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

                if (odd) {
                    res += Rev(str.substring(0, i)) + " ";
                    str = str.substring(i + 1);
                    odd = false;
                }

                else {
                    str = str.substring(i + 1);
                    odd = true;
                }

                i = 0;
            }
        }
    }

    void Display(){
        System.out.println(res);
    }

    public static void main(String[] args) {
        AlternateReverse obj = new AlternateReverse();

        obj.Input();

        obj.Alternate(false);

        obj.Display();
    }

}