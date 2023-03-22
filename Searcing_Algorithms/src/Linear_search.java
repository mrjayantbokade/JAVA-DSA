public class Linear_search {

    public static void main(String[] args) {



        // simple searching algorithm for an given element with index positioning
        //This is my way

        int[] arr = {55, 24, 14, 19, 20, 22};


        int a = 0;
        for (int num:arr){
            if (num == 55){
                System.out.println("Exist at index:" + a);

                return;
            }
            else {

                System.out.println("Not exist at index:" + a);
            }

            a++;
        }


        //so the time complexity here is Best : O(1) and the worst is O(n)

    }
}
