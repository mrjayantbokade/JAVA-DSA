public class Wealty_person {

    public static void main(String[] args) {

        int[][] persons = {
                {1, 2, 3},
                {9, 1, 6},
                {3, 3, 7}
        };



        System.out.println(wealth(persons));

    }


    //This function will return the max value of sum of the array
    static int wealth(int[][] arr){


        int max = 0;
        for (int persons=0; persons< arr.length; persons++){

            int sum = 0;
            for (int accounts=0; accounts<arr[persons].length; accounts++){

                sum  = sum + arr[persons][accounts];

            }

            if (sum > max){
                max = sum;
            }

        }
        return max;


    }
}
