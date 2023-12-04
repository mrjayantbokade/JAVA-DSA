public class Concept {


    public static void conofpassing(int n){
        if (n==0){
            return;
        }

        conofpassing(--n);   //instead os n-- there is diff betn n-- and --n
                            //that you already know
    }
    public static void main(String[] args) {
        conofpassing(5);
    }
}
