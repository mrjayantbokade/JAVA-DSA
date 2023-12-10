public class NewRBS {

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
        System.out.println("run");
    }
}
