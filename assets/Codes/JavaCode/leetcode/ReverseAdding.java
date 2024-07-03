
public class ReverseAdding {

    public static void main(String[] args) {
       
        int l1[] = {2 , 4 , 3};
        int l2[] = {5 , 6 , 4};

        String str1 = l1.toString();
        String str2 = l2.toString();

        System.out.println(Integer.parseInt(Reverse(str1, str1.length() - 1)));

        // int val = Integer.parseInt(Reverse(str1, str1.length() - 1)) + Integer.parseInt(Reverse(str2, str2.length() - 1));

        String ans = Reverse(Integer.toString(112), Integer.toString(222).length());

        int arr[] = new int[ans.length()];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = ans.charAt(i);
            System.out.print(arr[i] + " ");
        }

    }

    static String Reverse(String str , int i) {
        if(i == -1){
            return "";
        }

        return str.charAt(i) + Reverse(str, i - 1);
    }
}
