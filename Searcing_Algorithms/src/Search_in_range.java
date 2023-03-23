public class Search_in_range {

    public static void main(String[] args) {


        //Que.
        //Search the element [3] in the range of 1 and 4

        int[] arr = {2,3,4,3,2,5,3,2,4};

        int start = 1;
        int end = 4;
        int target = 3;
        inRange(arr,start,end,target);







    }

    public static void inRange(int[] arr, int strt, int end, int trgt){


        for (int i=strt; i<=end; i++)
            if (trgt == arr[i]){
                System.out.println("exist at position " + i);
                return;
            }
    }
}
