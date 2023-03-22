public class Linear_Searchby_kunal {
    public static void main(String[] args) {


        int[] arr = {55, 24, 14, 19, 20, 22};
        int returned_index = linearsearch(arr,164);
//        if (returned_index >= 0){
//            System.out.println("The element exist at index:" + returned_index);
//        }
//        else {
//            System.out.println("Doesn't exist");
//        }


        System.out.println(returned_index);



    }

    public static int linearsearch(int[] arr, int target){

        for (int index=0; index< arr.length; index++){

            int element = arr[index];
            if (element == target){
                return index;
            }



        }

        return -1;

    }
}
