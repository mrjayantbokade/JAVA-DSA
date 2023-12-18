package code;

public class FirstAndLastOccurence {
    
    public static void fal(String str, int index, int first, int last){
        
        if (index == str.length()){
            if (last == -1){
                last = first;
            }
            System.out.println("First Occurence: "+first);
            System.out.println("Last Occurence: "+last);
            return;
        }
        
        
        char ch = str.charAt(index);
        if (ch == 'a'){
            if (first == -1){
                first = index;
            }else {
                last = index;
            }
        }
        
        fal(str, index+1, first, last);
        
    }
    
    
    public static void main(String[] args) {
        String str = "abaacdaefaah";
//        String str = "bdsfljkfdsljkdfsjlfsdja";
        fal(str, 0, -1, -1);
    }
    
}
