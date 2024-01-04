import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void swap(int[] nums, int i, int correct ){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }


    public static boolean containsDuplicate(int[] nums) {

        if (nums.length == 1){
            return false;
        }

        for(int i=0; i<nums.length; i++){
            int correct = i+1;
            if(nums[i] != correct){
                swap(nums, i, correct);
            }
        }


        System.out.println(Arrays.toString(nums));

        for(int j=1; j<nums.length; j++){
            if(nums[j] == nums[j-1]){
                return true;
            }
        }


        return false;

    }

    public static void main(String[] args) {

        int[] nums = { 0};
        System.out.println(containsDuplicate(nums));
    }
}
