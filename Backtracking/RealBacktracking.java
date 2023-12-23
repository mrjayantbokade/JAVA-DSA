import java.util.Arrays;

public class RealBacktracking {
    
    public static void main(String[] args) {
        boolean[] [] maze = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
              };
         int[][] path = new int[maze.length][maze[0].length];
        
        
        System.out.println(backTrack(0, 0, maze,path,  1, ""));
        
    }
    
    
    public static int backTrack(int i, int j, boolean[][] maze,int[][] path, int count,  String processed){
        
      
        
        if (i == maze.length-1 && j == maze[0].length-1){
            path[i][j] = count;
            for(int[] num : path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(processed);
            return 1;
        }
        
        
        if (maze[i][j] == true){
            return 0;
        }else {
            maze[i][j] = true;
            path[i][j] = count;
        }
        int down = 0;
        int right = 0;
        int up = 0;
        int left = 0;
        
        if (i<2){ // or maze.length-1  it is same
            down =  backTrack(i+1, j, maze, path,count+1, processed+'D' );
        }
        if (j<2){
               right = backTrack(i, j+1, maze,path, count+1, processed+'R');
        }
        if (i > 0){
              up = backTrack(i-1, j, maze, path, count+1, processed+'U');
        }
        if ( j > 0){
              left = backTrack(i, j-1, maze, path, count+1, processed+'L');
        } 
        
        maze[i][j] = false; // this line is were the function came back from upward or remaing calls
        path[i][j] = 0;     // we have to undo the changes we made during calls
                            // make true if you done false and vice-versa
        return down + right + up + left;
    }
}
