import java.util.ArrayList;
import java.util.List;

public class FindAllSubsequences {


    //passing arraylist in the arguments if easy
    //bit more challenging is creating and returning the arrayslist
    //inside the body of function
    public static ArrayList<String> subseq(String unprocessed, String processed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(processed);
            return list;
        }

        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        left = subseq(unprocessed.substring(1),  processed+unprocessed.charAt(0));

        right = subseq(unprocessed.substring(1), processed);

         left.addAll(right);
         return left;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        ans = subseq("abc", "");
        System.out.println(ans);
    }
}


