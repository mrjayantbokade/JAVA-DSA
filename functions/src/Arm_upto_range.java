public class Arm_upto_range {
    public static void main(String[] args) {

        for (int i = 100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isArmstrong(int original){
        int copy = original;
        int sum = 0;

        while (copy>0){
            int rem = copy % 10;
            copy = copy / 10;

            sum = sum + rem*rem*rem;


        }


        if (original == sum){
            return true;
        }
        else {
            return false;
        }
    }
}
