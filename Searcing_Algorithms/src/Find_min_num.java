import org.w3c.dom.ls.LSOutput;

public class Find_min_num {

    public static void main(String[] args) {
        int[] arr = {2, 4, 24, 53, 532, 45, -4,-1, -5,-9};

        System.out.println(min(arr));

    }


    //this program will return the min num present in the array using linear search
    public static int min(int[] arr){

        int num_min = arr[0];
        for (int i=1; i< arr.length; i++){
            if(num_min > arr[i]){
                num_min = arr[i];
            }

        }
        return num_min;
    }

}
