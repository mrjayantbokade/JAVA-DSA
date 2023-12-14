public class DoRotatedBinarySearch {

    public static int RBS(int[] arr, int target, int s, int e){

        int m = s + (e-s) / 2;

        if (e < s){
            return -1;
        }

        if (arr[m] == target) {
            return m;
        }



        if (arr[s] <= target && target <= arr[m]){

            return RBS(arr, target, s, m-1);

        }else {
            return RBS(arr, target, m+1, e);
        }
    }


   


    public static void main(String[] args) {

        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(RBS(arr, 0, 0, arr.length-1));
//        System.out.println(RBS(arr, 4));
    }

}
