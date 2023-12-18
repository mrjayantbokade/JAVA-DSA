package code;

public class MoveAllXtoEnd {

    public static void moveToEnd(String original, String newStr, int count){
        if (original.isEmpty()){
           while (count != 0){
               newStr += 'x';
               count--;
           }
            System.out.println(newStr);
            return;
        }
        
        
        if (original.charAt(0) != 'x'){
            newStr += original.charAt(0);
        }else {
            count++;
        }
        
        moveToEnd(original.substring(1), newStr, count);
    }
    
    public static void main(String[] args) {
        
        String str = "abxcdexaccd";
        moveToEnd(str, "", 0);
    }
}
