import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_ArrayList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        //initially we have to fix the size of array list just like we fixed the size of 2d initially in
        //previos program

        //basically it just adding new array list in the one arraylist

        for (int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
//
        //adding the elements in the multidimensional arraylist by getting ther index and input with the
        //help of user
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println();


        //printing the elements in arraylist
//        for (int i=0; i<3; i++) {
//            System.out.println(list.get(i));
//        }



//        for(int i=0; i<3; i++){
//            for (int j=0; j<3; j++){
//                System.out.print(list.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
    }
}
