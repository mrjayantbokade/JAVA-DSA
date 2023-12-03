public class Numprinting {

    public static void Rec2(int num){
        if (num == 1){
            System.out.println(1);
            return;
        }

        System.out.println(num);
        Rec2(num-1);
    }


    public static void main(String[] args) {
        Rec2(5);
    }
}
