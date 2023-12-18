import java.util.ArrayList;
import java.util.List;

public class FindAllSubsequences {
    
    
    //passing arraylist in the arguments if easy
    //bit more challenging is creating and returning the arrayslist
    //inside the body of function
    public static ArrayList<String> subseq(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            
            ArrayList<String> asciList = asci(processed);
            
            list.add(processed);
            list.addAll(asciList);
            //or just can list.addAll(asci(processed)); instead of creating the
            //new arraylist i.e asciList
            
            return list;
        }
        
        ArrayList<String> left = subseq(unprocessed.substring(1), processed + unprocessed.charAt(0));
        
        
        ArrayList<String> right = subseq(unprocessed.substring(1), processed);
        
        
        left.addAll(right);
        return left;
    }
    
    
    public static ArrayList<String> asci(String sub) {

//        this has nothing to do with this function
//        just for information
//        String str = "abc";
//        is equivalent to:
//        char data[] = {'a', 'b', 'c'};
//        String str = new String(data);
        
        if (sub.isEmpty()) {
            return new ArrayList<>();
        }
        
        ArrayList<String> ascilist = new ArrayList<>();
        if (sub.length() == 3) {
            char one = sub.charAt(0);
            char two = sub.charAt(1);
            char three = sub.charAt(2);
            ascilist.add(String.valueOf((one + 0) + (two + 0) + (three + 0)));
        }
        if (sub.length() == 2) {
            char one = sub.charAt(0);
            char two = sub.charAt(1);
            ascilist.add(String.valueOf((one + 0) + (two + 0)));
            
        }
        if (sub.length() == 1) {
            char one = sub.charAt(0);
            ascilist.add(String.valueOf(one + 0));
            
        }
        if (sub.length() == 0) {
            ascilist.add(String.valueOf(0));
            
        }
        
        return ascilist;
    }
    
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        ans = subseq("abc", "");
        System.out.println(ans);

//        String ans =  String.valueOf(1000);
//        System.out.println(ans.getClass().getSimpleName());

//        System.out.println(asci("bc"));
    
    
    }
}


