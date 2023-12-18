import java.util.HashSet;

public class FindUniqueSubsequences {

    public static void uniqeSubseq(String original, String processed, HashSet<String> set) {

        if (original.isEmpty()) {
            if (set.contains(processed)) {
                return;                
            }else{
                System.out.println(processed);
                set.add(processed);
                return;
            }
            
        }


        uniqeSubseq(original.substring(1), processed+original.charAt(0), set);
        uniqeSubseq(original.substring(1), processed, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqeSubseq("abc", "", set);

    }
}