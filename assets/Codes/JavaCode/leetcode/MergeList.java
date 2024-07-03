public class MergeList {

    static int[] Sort(int arr[] ,int n){

        if(n == 0){
            return arr;
        }

        for(int i = 0 ; i < n - 1 ; i++){

            if(arr[i] > arr[i + 1]){
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        return Sort(arr, n - 1);
    }


    public static void main(String[] args) {

        int l1[] = { 1, 2, 4 };
        int l2[] = { 1, 3, 4 };

        int l3[] = new int[l1.length + l2.length];

        for (int i = 0; i < l1.length + l2.length ; i++) {

            if (i < l1.length) {
                l3[i] = l1[i];
            }

            else {
                l3[i] = l2[i - l1.length];
            }
        }

        Sort(l3, l3.length);

        for(int i = 0 ; i < l3.length ; i++){
            System.out.print(l3[i] + " | ");
        }
    }
}