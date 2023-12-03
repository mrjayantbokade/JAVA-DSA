import java.util.ArrayList;

public class Factorsofnumber {


    public static void factor1(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i*i<=num; i++){
            if (num % i == 0){
                if (num / i == i){
                    System.out.println(i);

                }else {
                    System.out.print(i + " " );
                    list.add(num/i);
                }
            }
        }
        for (int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void factor(int num){
        for (int i=1; i*i <= num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int num = 20;
        factor1(num);




    }
}
