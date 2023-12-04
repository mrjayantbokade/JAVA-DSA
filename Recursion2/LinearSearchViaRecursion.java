import java.util.ArrayList;

public class LinearSearchViaRecursion {




    public static ArrayList alltarget(int [] arr, ArrayList listoftargetindex, int target, int index){

        if (index == arr.length-1){
            if (arr[index] == target){
                listoftargetindex.add(index);
                return listoftargetindex;
            }
        }
        if (arr[index] == target){
            listoftargetindex.add(index);
        }


        return alltarget(arr,listoftargetindex, target, index+1);
    }
    static ArrayList<Integer> list  = new ArrayList<>();

    public static void oneway(int [] arr, int target, int index){

        if (index == arr.length-1){
            if (arr[index] == target){
                list.add(index);
                return;
            }
        }
        if (arr[index] == target){
            list.add(index);
        }

        oneway(arr, target, index+1);

    }

    public static boolean kunalsapproach(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target  || kunalsapproach(arr, target, index+1);
    }
    public static int linearSearch(int [] arr, int target, int index){

        if (index == arr.length-1){
            if (arr[index] == target){
                return index;
            }else {
                return -1;
            }
        }
        if (arr[index] == target){
            return index;
        }

        return linearSearch(arr, target, index+1);
    }


    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 33, 33, 33, 1, 2, 3, 4, 5, 6, 2, 4, 2, 33};
        int target =33;
        ArrayList<Integer> listoftargetindex = new ArrayList<>();
//        System.out.println(linearSearch(arr, target, 0));
//        System.out.println(kunalsapproach(arr, target, 0));
//        alltarget(arr, target, 0);
//        System.out.println(listoftargetindex);
        System.out.println(alltarget(arr, listoftargetindex,target, 0));
    }
}
