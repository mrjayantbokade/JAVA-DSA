package pack;

public class Sumofprimenumbers {


    public static long sum(int num){
        long sum = 0;
        for (int i = 2; i<=num; i++){
            if (isprime(i) == 1){
                sum += i;
            }
        }
        return  sum;
    }


    public static int isprime(int num){
        int count = 0;
        for (int i=2; i<num; i++){
            if (num % i == 0){
                count = count + 1;
            }
        }
        return count == 0 ? 1:0;
    }
    public static void main(String[] args) {
        int n = 10;

        long ans = sum(n);
        System.out.println(ans);

    }
}
