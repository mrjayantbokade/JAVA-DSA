public class Even_digits {


    public static void main(String[] args) {

        int[] arr = {2, 22, 333,4444, 55555, 666666 };

      for (int num: arr){
         int evenornot = (even(num));
         if (evenornot % 2 == 0){
             System.out.println(num + " contain even number of digits");
         }
      }
    }

    public static int even(int arr){

        int count = 0;
        while (arr > 0){
            count++;
           arr =  arr / 10;
        }

        return count;
    }
}
