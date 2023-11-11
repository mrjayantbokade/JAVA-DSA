public class Fibonacci {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z = 0;
        int n = 13;



        for (int i=0; i<=n; i++){


           while (z != n){
                System.out.println(z);
                x = y;
                y = z;
                z = x+y;
            }
        }
    }
}
