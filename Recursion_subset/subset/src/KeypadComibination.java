public class KeypadComibination {
    
    public static void printComb(String original, String combination, String[] arr ){

        if (original.isEmpty()) {
            System.out.println(combination);
            return;            
        }

        String mapping = arr[original.charAt(0) - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(original.substring(1), combination+mapping.charAt(i), arr);
        }

    }


    public static void main(String[] args) {
        String input = "23";
        String[] arr = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        printComb(input, "", arr);
    }
    
}
