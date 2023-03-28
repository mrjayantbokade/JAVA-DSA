public class CH {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6 , 8, 9, 10};
        int[] brr = {10, 8, 7, 6, 4, 2, 0};
        int[] trr = {255, 555 , 666 , 847, 995, 10254};


        System.out.println(binarysearch(trr, arr.length, 666));

    }

    public static int binarysearch(int[] arr, int size, int target){
//
//        int start = 0;
//        int end = size-1;
//        int mid = (start+end)/2;
//
//
//        while (start <= end){
//
//            if (arr[mid] == target){
//                return mid;
//            }
//
//
//            if (arr[mid] > target){
//                end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//
//            mid = (start+end)/2;
//        }
//
//
//        return -1;

        int start = 0;
        int end = size-1;
        int mid = (start + end) / 2;

        while (end <= end){

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                end = mid-1;
            }

            else {
                start = mid+1;
            }


            mid = (start + end) / 2;
        }
        return -1;





    }
}
