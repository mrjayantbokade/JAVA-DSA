package code;

public class DuplicatesRemove {
    
    public static void removeDuplicate(String original, String newStr, boolean[] arr){
        if (original.isEmpty()){
            System.out.println(newStr);
            return;
        }
        
        char ch = original.charAt(0);
        if (arr[ch - 'a'] == false){
            arr[ch - 'a'] = true;
            newStr += ch;
        }
        
        removeDuplicate(original.substring(1), newStr, arr);
    }
    
    
    public static void main(String[] args) {
        boolean[] arr = new boolean[26];
        removeDuplicate("abbccdxxxxx", "", arr);
    }
}
