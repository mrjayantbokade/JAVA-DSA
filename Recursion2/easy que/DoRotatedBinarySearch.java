public class DoRotatedBinarySearch {


    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }

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

        int [] arr = {4,5,6,7,8,1,2,3};
//        System.out.println(RBS(arr, 8, 0, arr.length-1));
//        System.out.println(RBSusingloop(arr, 8));
        int ans = search(arr, 8, 0,arr.length-1);
        System.out.println(ans);
    }

}
