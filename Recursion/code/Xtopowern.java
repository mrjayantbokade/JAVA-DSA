package code;

public class Xtopowern {
    public static int calXtopowern(int x, int n, int count){
        if (x == 0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if(n==1){
            count = count * x;
            return count;
        }

        count = count *x;
        return calXtopowern(x, n-1, count);
    }


    public static void main(String[] args) {
        System.out.println(calXtopowern(2, 5, 1));
    }
}
