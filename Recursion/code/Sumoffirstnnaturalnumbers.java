package code;

public class Sumoffirstnnaturalnumbers {
    public static int sum(int n, int count){


        if(n==1){
            count+=n;
            return count;
        }

        count+=n;
        return sum(n-1, count);
    }


    public static void main(String[] args){
        System.out.println(sum(5, 0));
    }
}
