package pack;

public class ReccurenceRelation {


    public static int rr(int[] arr, int start, int end, int target){


        while (end >= start){
            int mid = (start + end) / 2;


            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
                return rr(arr, start, end, target);
            }

            if (arr[mid] < target) {
                start = mid + 1;
                return rr(arr, start, end, target);
            }

        }
            return -1;

    }



    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 1;

        int ans = rr(arr, 0, arr.length-1, target);

        if (ans == -1){
            System.out.println("The element is NOT FOUND");
        }
        else {
            System.out.println("Element found at index "+ans);
        }
    }
}
