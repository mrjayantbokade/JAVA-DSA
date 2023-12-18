public class Permutations {
    
    
    
    public static void per(String processed, String unprocessed){
        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        
        
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            per(f+ch+s, unprocessed.substring(1) );
            
            
            
        }
    }
    public static void main(String[] args) {
    
        
    }
}
