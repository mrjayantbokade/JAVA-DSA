public class Squareroot {



    public static double sroot(int n, int p){

        int start = 0;
        int end = n;
        while (end >= start){
            int mid = start + (end - start) / 2;

            if (mid * mid == n){
                return mid;
            }

            if (mid * mid > n){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }


      return n;
    }



    public static void main(String[] args) {


        int n = 36;
        int p = 3;

        double res = sroot(n, p);
        System.out.println(res);

    }
}
