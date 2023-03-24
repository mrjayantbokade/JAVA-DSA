public class Searchin2d_Array {


    public static void main(String[] args){

        int[][] arr = {
                {12,34, 23, 32, 55},
                {24, 66},
                {64, 64, 43, 77}
        };


        int target = 66;

        System.out.println(search(arr, target));


    }


    //this program will find the element in the 2d array using linear search
    public static boolean search(int[][] arr, int target){



        for(int i=0; i<arr.length; i++){

            for (int j=0; j<arr[i].length; j++){
//               System.out.print(arr[i][j]+" ");
                if (arr[i][j] == target){
                    return true;

                }

            }
        }

        return false;

    }
}
