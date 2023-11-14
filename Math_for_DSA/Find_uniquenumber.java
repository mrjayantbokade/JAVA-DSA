public class Find_uniquenumber {


    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 3, 2, 4, 6};

        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {


        int unique = 0 ;
        for (int num : arr){
            unique = num ^ unique;
        }
        return unique;

    }
}
