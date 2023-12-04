public class LinearSearchViaRecursion {



    public static boolean kunalsapproach(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target  || kunalsapproach(arr, target, index+1);
    }
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
        int target =33;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(kunalsapproach(arr, target, 0));
    }
}
