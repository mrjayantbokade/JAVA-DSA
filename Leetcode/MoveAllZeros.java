import java.util.Arrays;

public class MoveAllZeros {
    public static void moveZeroes(int[] nums) {


        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                n += 1;
            }
        }

        int count=0;
        for(int i=0; i < nums.length-n; i++){
            if(nums[i] == 0){

                    int temp = nums[i];
                    nums[i] = nums[nums.length-1-count];
                    nums[nums.length-1-count] = temp;
                    count += 1;



            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
