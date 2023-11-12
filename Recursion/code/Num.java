package code;

public class Num {

    public static void countdown(int n){
        if (n == 100){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        countdown(n+1);
    }
    public static void main(String[] args) {
        countdown(1);
    }
}
