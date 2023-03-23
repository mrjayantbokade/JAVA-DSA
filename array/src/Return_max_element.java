public class Return_max_element {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};

//        System.out.println(max_value_in_range(arr,1,3));


//       System.out.println("The max value form the array: "+max_value(arr));
    }

    public static int max_value(int[] arr){
        int max_el = arr[0];

        for (int i=1; i<arr.length; i++)
        {

            if (arr[i] > max_el){
                max_el = arr[i];
            }
        }
        return max_el;
    }



    //This function will return a max value from a particular range provided by the user while callin
    //function
    //
    public static int max_value_in_range(int[] arr, int start, int end){
        int max_el = arr[0];

        for (int i=start; i<=end; i++)
        {

            if (arr[i] > max_el){
                max_el = arr[i];
            }
        }
        return max_el;
    }
}
