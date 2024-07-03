// Question was to create a fnc that reverses the string s and returns it but the string is in array type at which characters of the string are the parts of Array.

// Input:- s = ['h' , 'e' , 'l' , 'l' , 'o']

// OUTPUT:- ['o', 'l', 'l', 'e', 'h']

import java.util.Scanner;
public class ReverbArray_Easy {


    static char[] Reverse(char[] word){
        char newarr[] = new char[word.length];

        for(int i = word.length - 1 ; i >= 0 ; i--){
            newarr[word.length - 1 - i] = word[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String to Reverse it: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray(); 

        System.out.println(Reverse(arr));

        sc.close();

    }

    
}
