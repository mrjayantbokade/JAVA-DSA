import java.util.Arrays;

public class Que1 {

    public static int findMissing0N(int[] nums){


        for (int i=0; i<nums.length;){


            int element = nums[i];
            if (i == element || element == nums.length){
                i++;
            }else {
//                swap(nums, i, element);
                int temp = nums[i];
                nums[i] = nums[element];
                nums[element] = temp;

            }
        }

        int j = 0;
        while (j < nums.length){

            if (j == nums[j] || j == nums.length){
                j++;
            }else {
                return j;
            }
        }

        return nums.length;





    }

     static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

    }


    public static int missingNumber(int[] nums){

        Arrays.sort(nums);
        Arrays.toString(nums);
        int i=0;
        while (i<nums.length){
            if (i == nums[i] || i == nums.length){
                i++;
            }else{
                return i;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int [] arr = { 9,6,4,2,3,5,7,0,1};

//        System.out.println(findMissing0N(arr));
//        System.out.println(Arrays.toString(arr));


        System.out.println(missingNumber(arr));

    }
}
