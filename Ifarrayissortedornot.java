package pack;

public class Ifarrayissortedornot {


    public static boolean issorted(int[] arr){

        for (int i=0; i<arr.length-1; i++){
            if (arr[i+1] < arr[i] || arr[i+1] != arr[i]){
                return false;

            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};


        boolean ans = issorted(arr);
        System.out.println(ans);
    }
}
