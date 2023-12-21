public class DiceCombination {
    public static void main(String[] args) {
        printDiceCombn("", 4);
    }
    static void printDiceCombn(String processed, int target){
        
        if (target == 0){
            System.out.println(processed);
            return;
        }
        
        for (int i = 1; i <= 6 && i <= target; i++) {
            printDiceCombn(processed + i, target-i);
        }
        
        
    }
}
