public class CountNumberOfZeros {
    public static int count(int zeros, int num){
        if(num == 0){
            if (num - 0 == 0){
                return zeros+1;
            }
            return zeros;
        }

        int rem = num % 10;
        if (rem == 0){
            zeros += 1;
        }

        return count(zeros, num/10);

    }

    public static void main(String[] args) {
        System.out.println(count(0, 0000));
    }


}

