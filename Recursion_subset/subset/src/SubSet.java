import java.util.*;
public class SubSet {
    public static void main(String[] args) {
        
        
        int[] arr = { 1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer>  list : ans){
            System.out.print(list);
        }
    }
    
    static List<List<Integer>> subset(int[] arr) {
        
        //not gettting this
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<>());
        
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        
        return outer;
    }
    
    
    
    public static List<List<Integer>> mine(int[] arr ){
        
        List<List<Integer>> main = new ArrayList<>();
        
        main.add(new ArrayList<>());

        for (int num : arr){
            int n = main.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(main.get(i));
                internal.add(num);
                main.add(internal);
            }
        }

        return main;
    }
}
