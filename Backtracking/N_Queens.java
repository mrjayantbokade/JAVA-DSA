import java.util.*;

public class N_Queens {
    
    
    public static void queens(boolean[][] board, int row ){
        
        if (row == board.length){
            display(board);
            return;
//            return 1;
        }
        
        for (int col=0; col<board.length; col++){
            
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row+1);
                board[row][col] = false;
            }
            
        }
    }
    
    private static boolean isSafe(boolean[][] board, int row, int col) {
        
        //up-vertical check
        for (int i = 0; i < row; i++) {
            //col will same and row will be variable
            if (board[i][col]){   // if this is true then return false
                return false;
            }
        }
        
        int maxLeft = Math.min(row,col);
        // left-diagonal check
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][col-i]){
                return false;
            }
            
        }
        
        //right-diagonal check
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 0; i <= maxRight; i  ++) {
            if (board[row-i][col+i]){
                return false;
            }
            
        }
        return true;
    }
    
    public static void display(boolean[][] board){
        
        
        for (boolean[] row : board){
            for (boolean element : row){
                if (element ){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == true){
//                    System.out.print('Q'+" ");
//                }else {
//                    System.out.print('X'+" ");
//                }
//
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//        System.out.println();
    }
    
    
    public static void main(String[] args){
    
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }
    
}
