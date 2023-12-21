import java.util.ArrayList;

public class ReturnArraylist {
    public static ArrayList<String> printPermutations(String unprocessed, String processed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            System.out.println(processed);
            return list;
            
        }
        
        ArrayList<String>  listAll = new ArrayList<>();
        
        char  ch = unprocessed.charAt(0);
        
        for (int i = 0; i <= processed.length(); i++) {
            String first  = processed.substring(0, i);
            String last = processed.substring(i, processed.length());
            
            
            listAll.addAll(printPermutations(unprocessed.substring(1), first+ch+last));
            
        }
        
        
        
        
        return listAll;
        
    }
    
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = printPermutations(str, "");
        System.out.println(ans);
        
    }
    
}
