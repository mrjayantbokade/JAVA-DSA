public class Ceiling_num {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,6,7,8,9};
        int target = 4;
        ceil(arr, target);

    }

    public static void ceil(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
             int small = arr[i];
            if (arr[i] == target){
                for (int j=arr[i]; j<arr.length; j++){
                    if (arr[i] < target){
                        small = arr[j];
                        System.out.println(small);
                    }
                }
            }
        }

    }
}
