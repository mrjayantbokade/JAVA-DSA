import java.util.List;
import java.util.*;

public class FindAllDuplicates {

    public static List<Integer> findDuplicates(int[] arr){
        List<Integer> list = new  ArrayList<>();

        if (arr.length == 0 || arr.length == 1){
            return list;
        }

        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;

            if (arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex]  = temp;
            }else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {

            if (j != arr[j]-1){
                list.add(arr[j]);
            }

        }


        return list;

    }

    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        int[] arr = {1, 1, 2};
        int[] arr = {};



        List<Integer> anslist = new ArrayList<>();

        anslist = findDuplicates(arr);
        for (int l=0; l<anslist.size(); l++){
            System.out.print(anslist.get(l)+", ");


        }

    }
}
