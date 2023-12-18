package code;
import java.util.*;

public class TowerOfHanoi {
    
    public static void toh(int n, String src, String helper, String dest){
        
        
        if (n == 1){
            System.out.println(n + " is transfer from " + src + " -> "+ dest);
            return;
        }
        toh(n-1, src, dest, helper);
        System.out.println(n + " is tranfer from "+ src + " -> "+ dest);
        toh(n-1, helper, src, dest);
    }
    
    
    public static void main(String[] args) {
        toh(3, "S" , "H", "D");
    
    }
}
