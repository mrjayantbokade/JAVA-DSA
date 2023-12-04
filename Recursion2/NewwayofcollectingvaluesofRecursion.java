import java.util.ArrayList;

public class NewwayofcollectingvaluesofRecursion {

    public static ArrayList check(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (num == 0){
            return list;
        }
        list.add(num);
        ArrayList<Integer> collector = check(num-1);
        list.addAll(collector);
        check(num-1);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
    }
}
