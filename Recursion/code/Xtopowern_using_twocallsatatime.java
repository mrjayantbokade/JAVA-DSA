package code;

public class Xtopowern_using_twocallsatatime {
    public static int calXtopowern(int x, int n){
        if (x == 0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if (n%2== 0){
            return calXtopowern(x, n/2) * calXtopowern(x, n/2);
        }

            return calXtopowern(x, n/2) * calXtopowern(x, n/2) * x;



    }


    public static void main(String[] args) {
        System.out.println(calXtopowern(2, 7));
    }
}
