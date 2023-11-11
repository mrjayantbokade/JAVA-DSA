public class Count_occurence_of_num {
    public static void main(String[] args) {

        int n = 47227477;
        int count = 0;

       while (n>0){

           int rem = n % 10;

           n = n/10;

           if (rem == 7){
               count++;
           }
       }
        System.out.println(count);
        System.out.println("hello");


    }
}
