public class Countzerosinmatrix {

    public static int countZeros(int A[][], int N)
    {
            int count = 0;
            for (int i=0; i<N; i++){
                for (int j=0; j<N; j++){
                    if (A[i][j] == 0){
                        count += 1;
                    }

                }
            }
            return  count;
    }


    public static void main(String[] args) {


        int N = 3;
        int[][] A = {{0, 0, 0},
                     {0, 0, 1},
                     {0, 1, 1}};

        System.out.println(countZeros(A,N));
    }
}
