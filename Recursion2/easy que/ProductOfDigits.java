public class ProductOfDigits {

    public static int typesone(int num){
        if (num % 10 == num){
            return num;
        }

        return num % 10 * typesone(num / 10);
    }
    public static int types2(int mul, int num ){
        if(num % 10 == num){
            mul *= num;
            return mul;
        }

        int rem = num % 10;
        mul *= rem;
        return types2(mul, num/10);
    }

    public static void main(String[] args) {
//        int sum  = myapproach_sumofdigits(0,143);
//        int sum  = typesone(505);
        int sum  = types2(1,143);
        System.out.println(sum);
    }
}
