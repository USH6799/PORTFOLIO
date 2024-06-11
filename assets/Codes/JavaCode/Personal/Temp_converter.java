package Personal;
import java.util.Scanner;
//Scanner Class For Input From the User

/**
 * Temp_converter
 */

public class Temp_converter {

    public static void main(String[] args/*<-- 'String[] args' Can Be Replaced By 'int temp' For Input From The terminal , If u are using this then don't use Scanner Class*/)

     {
        Scanner sc = new Scanner(System.in);
        //Scanner 'sc'<- obj for Input

        System.out.print("Enter The Temperature[Only numbers]: ");
        //Asking For Temperature In Any Scale

        int temp = sc.nextInt();
        //input taken in var 'temp'

        System.out.println(temp + "`C ---> "+ ( (int) temp  + 273) + "`K");
        //Celsius to Kelvin [K = 273 + C]

        System.out.println(temp + "`C ---> "+ ( (int) (temp * 1.8) + 32) + "`F");
        //Celsius to Farenheit [F = 1.8C + 32]

        System.out.println(temp + "`K ---> "+ ( temp - 273) + "`C");
        //Kelvin to Celsius [C = K - 273]
        System.out.println(temp + "`K ---> "+ ( (int) ((temp - 273) * 1.8) + 32) +"`F");
        //Kelvin to Farenheit [F = 1.8(K - 273) + 32] 

        System.out.println(temp + "`F ---> "+ ( (int) ((temp - 32) / 1.8) + "`C"));
        //Farenheit to Celsius [C = F/1.8 - 32]

        System.out.println(temp + "`F ---> "+ ( (int) ((temp - 32) / 1.8) + 273) + "`K");
        //Farenheit to Kelvin [K = (F - 32)/1.8 + 273]

        sc.close();
        //Closing Input Obj So There Will Be no Further Use Of Scanner Class | Not Important To write , Only For Supressing Warnings

    }
    
}