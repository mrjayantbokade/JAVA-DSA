public class Squareroot {



    public static double sroot(int n, int p){

        int start = 0;
        int end = n;

        double root = 0.0;

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

        double increment = 0.1;

        for (int i=0; i<p; i++){
            while (root*root < n) {
                root += increment;
            }

            root -= increment;
            increment /= 10;

        }






      return root;
    }



    public static void main(String[] args) {


        int n = 40;
        int p = 3;

        double res = sroot(n, p);
        System.out.printf("%.4f",res);

    }
}
