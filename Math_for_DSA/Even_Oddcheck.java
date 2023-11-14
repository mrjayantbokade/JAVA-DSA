import java.util.Scanner;

public class Even_Oddcheck {


    public static boolean isOdd(int num){
        //this function will tell if the value is odd or not 
        return (num & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  num = in.nextInt();
        System.out.println(isOdd(num));

//        if ((num & 1) == 1){
//            System.out.println(num + " is odd.");
//        }else {
//            System.out.println(num +" is even.");
//        }





    }
}
