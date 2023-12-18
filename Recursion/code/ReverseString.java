package code;

public class ReverseString {
    
    public static String reverseString(String str, int index){
        if (index < 0){
            return " ";
        }
        char ch = str.charAt(index);
        return "" + ch + reverseString(str, index-1);
    }
    
    public static void main(String[] args) {
        String name = "Jayant";
        System.out.println(reverseString(name, name.length()-1));
    }
}
