public class ArrayIsSorted {


    public static boolean withourecursion(int[] arr){
        int count =0;

        for (int i=1; i< arr.length; i++){
            if (arr[i-1] < arr[i]){
                count += 1;
            }
        }

        if (count == arr.length-1){
            return true;
        }

        return false;
    }

    public static boolean isSorted(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }


    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 2, 333};
        System.out.println(isSorted(arr, 0));
        System.out.println(withourecursion(arr));
    }
}
