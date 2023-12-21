
public class Permutations {
    
    
    public static void printPermutations(String unprocessed, String processed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        
        
        char  ch = unprocessed.charAt(0);
        
        for (int i = 0; i <= processed.length(); i++) {
            String first  = processed.substring(0, i);
            String last = processed.substring(i, processed.length());
            
            String passingString = first + ch + last;
            printPermutations(unprocessed.substring(1),passingString );
        }
        
        
    }
    
    public static void main(String[] args) {
//        String name = "ba";
//        System.out.println( name.substring(0,0));
//        System.out.println( name.substring(0,1));
//        System.out.println( name.substring(1,name.length()));
        
        
        
        String str = "abc";
        printPermutations(str, "");
    }
}
