public class ReverseANumber {



    public static int reverse(int rev , int n){
        if (n == 0){
            return rev;
        }

        rev = rev * 10 + ( n % 10);
        return reverse(rev, n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(0,243));
    }
}
