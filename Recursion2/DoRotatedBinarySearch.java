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


    public static int RBSusingloop(int[] arr, int target){

        int s = 0;
        int e = arr.length-1;

        int m = s + (e-s) / 2;

        while (s <= e){


            if (arr[m] == target) {
                return m;
            }


            if (arr[s] <= arr[m]){
                if (arr[s] <= target && target <= arr[m]){

                    e =  m-1;

                }else {
                    s =  m+1;
                }
            }

            if (arr[m] <= target && target <= arr[e]){
               e = m-1;
            }else {
                e = m-1;
            }



            m = s + (e-s) / 2;
        }

        return  -1;
    }


    public static void main(String[] args) {

        int [] arr = {4,5,6,7,8,1,2,3};
//        System.out.println(RBS(arr, 8, 0, arr.length-1));
        System.out.println(RBSusingloop(arr, 8));
    }

}
