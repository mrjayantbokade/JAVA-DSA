public class Reverse {
    public static void main(String args[]){


        //self
        int n = 345;
        int rev  = 0;

        while (n>0){

            int rem = n % 10;

            rev = (rev * 10) + rem;

            n = n / 10;


        }

        System.out.println(rev);
    }
}
