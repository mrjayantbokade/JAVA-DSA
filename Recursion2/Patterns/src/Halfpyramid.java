public class Halfpyramid {



    public static void p1r(int row, int col){

        if(row == 0){
            return;
        }

        if (col < row ){

            p1r(row, col+1);
            System.out.print("*"+" ");


        }
        else{
            p1r(row-1, 0);
            System.out.println();

        }
    }
    public static void p1(int row, int col){

        if(row == 0){
            return;
        }

        if (col < row ){
            System.out.print("*"+" ");
            p1(row, col+1);
        }
        else{
            System.out.println();
            p1(row-1, 0);
        }
    }
    public static void main(String[] args) {

        p1(4,0);
        p1r(4,0);

    }
}
