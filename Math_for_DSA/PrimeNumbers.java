public class PrimeNumbers {



    public static boolean isPrime(int num){

        if (num <= 1){
            return false;
        }

        for (int i=2; i*i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }



        return true;
    }



    public static void main(String[] args) {


        for (int i = 1; i<=13; i++){
            System.out.println(i + " "+ isPrime(i));


        }



        
    }
}
