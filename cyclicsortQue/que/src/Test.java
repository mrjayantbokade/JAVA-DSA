import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void findmissing(int[] nums){

      int i=0;
      while (i < nums.length){
          int correct  = nums[i] - 1;
          if (nums[i] != nums[correct]){
              swap(nums, i, correct);
          }else {
              i++;
          }
      }


      List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                list.add(index+1);
            }

    }

        for (int l = 0; l < list.size(); l++) {
            System.out.print(list.get(l)+", ");

        }
    }

    public static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};

        findmissing(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
