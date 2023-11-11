package pack;

public class Pattern {


public static void pattern5(int n){
    n = n*2;

    for (int row = 1; row < n; row++) {
        for (int col = 1; col < n; col++) {

//            System.out.print(col+"  ");
            int left = row;
            int right = n-row;
            int above = col;
            int down = n-col;
//
//            int one = Math.min(left, right);
//            int two = Math.min(above, down);
//            int min = Math.min(one, two);

            int one = Math.max(left, right);
            int two = Math.max(above, down);
            int max = Math.max(one, two);
            System.out.print(max-5+" ");

        }
        System.out.println();

    }
}
    public static void pattern4(int n){
        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space<=n-row; space++ ){
                System.out.print("  ");
            }

            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int sec = 2; sec<=row; sec++){
                System.out.print(sec+" ");
            }



            System.out.println();
        }


        for (int row=1; row<n; row++){
            for (int space=1; space<row+1; space++){
                System.out.print("  ");
            }
            for (int col = n-row; col>=1; col--){
                System.out.print(col+" ");
            }
            for (int secpart=2; secpart<=n-row; secpart++){
                System.out.print(secpart+" ");
            }
            System.out.println();
        }
    }


    public static void pattern3(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = n-1; i >= 1 ; i--) {
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }



//    public static void pattern5(int n){
//        for (int row = 1; row<=n; row++){
//            for (int space = 1 )
//        }
//    }
    public static void main(String[] args) {


        pattern5(5);
//        int n=3;



    }
}
