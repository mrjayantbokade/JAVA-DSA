import java.util.Scanner;

public class Even_Oddcheck {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  num = in.nextInt();

        if ((num & 1) == 1){
            System.out.println(num + " is odd.");
        }else {
            System.out.println(num +" is even.");
        }
    }
}
