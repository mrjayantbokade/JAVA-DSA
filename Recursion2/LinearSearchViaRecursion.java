public class LinearSearchViaRecursion {
    public static int linearSearch(int [] arr, int target, int index){

        if (index == arr.length-1){
            if (arr[index] == target){
                return index;
            }else {
                return -1;
            }
        }
        if (arr[index] == target){
            return index;
        }

        return linearSearch(arr, target, index+1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 2, 4, 2, 33};
        int target =88;
        System.out.println(linearSearch(arr, target, 0));
    }
}
