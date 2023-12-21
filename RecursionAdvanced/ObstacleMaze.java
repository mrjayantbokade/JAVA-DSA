public class ObstacleMaze {
    
    public static void main(String[] args) {
        System.out.println(andDiagonalAlso(1,1, ""));
    }
    static int andDiagonalAlso(int i, int j, String processed){
        
        if (i == 2 && j == 2){
            return 0;
        }
        if (i == 3 && j == 3){
            System.out.println(processed);
            return 1;
        }
        
        if (i == 3 ){
//            return 1;
            return  andDiagonalAlso(i, j+1,processed+'R' );
        }
        
        int down = 0;
        int right = 0;
        int diagonal = 0;
        if (j == 3){
//            return 1;
            return andDiagonalAlso(i+1, j, processed+'D');
        }else{
            down = andDiagonalAlso(i+1, j, processed+'D');
            right = andDiagonalAlso(i, j+1, processed+'R');
            diagonal = andDiagonalAlso(i+1, j+1, processed+'G');
            
        }
        return down + right+ diagonal;
    }
}
