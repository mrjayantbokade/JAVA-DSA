public class Test {
    
    
    public static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == true){
                    System.out.print("Q  ");
                }else {
                    System.out.print("X  ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    public static int queens(boolean[][] board, int row){
        
        if (row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count +=  queens(board, row+1);
                board[row][col] = false;
            }
            
        }
        return count;
    }
    
    public static boolean isSafe(boolean[][] board, int row, int col){
        
        //vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == true){
                return false;
            }
        }
        
        //left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][col-i] == true){
                return false;
            }
        }
        
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row-i][col+i] == true){
                return false;
            }
        }
        
        
        return true;
    }
    
    
    public static void main(String[] args) {
        
        int n = 10;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
}
