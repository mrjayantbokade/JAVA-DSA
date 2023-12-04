public class SumOfDigits {



    public static int kunals_approcah_sumofdigits(int num){
        if (num % 10 == num){
            return num;
        }

        return num % 10 + kunals_approcah_sumofdigits(num / 10);
    }
    public static int myapproach_sumofdigits(int sum, int num ){
        if(num == 0){
            return sum;
        }

        int rem = num % 10;
        sum += rem;
        return myapproach_sumofdigits(sum, num/10);
    }

    public static void main(String[] args) {
//        int sum  = myapproach_sumofdigits(0,143);
        int sum  = kunals_approcah_sumofdigits(143);
        System.out.println(sum);
    }
}
