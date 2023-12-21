public class KeypadCombination {
    static String[] arr = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
    
    printKeypadCombination("23", "");
    
    }
    
    static void printKeypadCombination(String unprocessed, String combination){
        if (unprocessed.isEmpty()){
            System.out.println(combination);
            return;
        }
        
//         mapping or num or range
        int mapping = unprocessed.charAt(0) - '0';
        String arrStr = arr[mapping];
        
//
        for (int i = 0; i < arrStr.length(); i++) {
            printKeypadCombination(unprocessed.substring(1), combination+arrStr.charAt(i));
        }
    }
}
