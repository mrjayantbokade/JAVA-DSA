import java.util.Arrays;

public class Que2 {
    public static int findMissing1N(int[] nums){

        Arrays.toString(nums);
        for (int i=0; i<nums.length;){


            int element = nums[i];
            if (element == i+1){
                i++;
            }else {
                swap(nums, i, element-1);


            }
        }

        return 0;
//        int j = 0;
//        while (j < nums.length){
//
//            if (j == nums[j] || j == nums.length){
//                j++;
//            }else {
//                return j;
//            }
//        }
//
//        return nums.length;



    }
    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};

//        System.out.println(findMissing1N(arr));
        System.out.println(findMissing1N(arr));
//        System.out.println(Arrays.toString(arr));


    }
}
