public class MazeProblem {
    
    
    static int andDiagonalAlso(int i, int j, String processed){
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
    static void mazeProb(String processed, int i, int j){
        
        if (i == 3 || j == 3){
            return;
        }
        if (i == 2 && j == 2){
            System.out.println(processed);
            return;
        }
        
        
        mazeProb(processed+'R', i+1, j);
        mazeProb(processed+'D', i, j+1);
        
    }
    
    
    static int afterIntuationmazePathCount(String processed, int i, int j){
        
        if (i == 3 || j == 3){
            return 0;
        }
        if (i == 2 && j == 2){
            System.out.println(processed);
            return 1;
        }
        
        int right = 0;
        int down = 0;
        if (i == 2){
            down  = afterIntuationmazePathCount(processed+'D', i, j+1);
            
        }
        if (j == 2){
            right = afterIntuationmazePathCount(processed+'R', i+1, j);
            
        }else{
            right = afterIntuationmazePathCount(processed+'R', i+1, j);
            down  = afterIntuationmazePathCount(processed+'D', i, j+1);
        }
        
        
        return right+down;
    }
    static int mazePathCount(String processed, int i, int j){
        
        if (i == 3 || j == 3){
            return 0;
        }
        if (i == 2 && j == 2){
            System.out.println(processed);
            return 1;
        }
        
        int right = 0;
        int down = 0;
       
            right = mazePathCount(processed+'R', i+1, j);
            down  = mazePathCount(processed+'D', i, j+1);
        
        
        
        return right+down;
    }
    
    
    public static int kunalsway(int i, int j){
        if (i == 0 || j == 0){
            return 0;
        }
        if (i == 1 && j == 1){
            return 1;
        }
        
        if (i == 1){
            return 1;
        }
        if (j == 1){
            return 1;
        }
        return kunalsway(i-1, j) + kunalsway(i, j-1);
    }
    
    public static void main(String[] args) {
//        mazeProb("", 0, 0);
//        System.out.println(kunalsway(3, 3));
//        System.out.println(mazePathCount("", 0, 0));
        System.out.println(andDiagonalAlso(1,1, ""));
    }
}
