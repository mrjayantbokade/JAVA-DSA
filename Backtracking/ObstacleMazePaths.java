public class ObstacleMazePaths {
    
    
    public static void main(String[] args) {
        boolean[][] boardO = {
                             {false, false, false},
                             {false, true, false},
                             {false, false, false}
                            };
//        System.out.println(backTracking(board, 0, 0, ""));
        System.out.println(obstaclePathCounts(0,0, boardO, ""));
    }
    
    public static int obstaclePathCounts(int i, int j, boolean[][] maze, String processed){
        
        if (i == 3 || j == 3){
            return 0;
        }
        if (maze[i][j] == true){  //this means there is river or obstacle as true
            
            return 0;
        }
        
        if (i == maze.length-1 && j == maze[0].length-1){
            System.out.println(processed);
            return 1;
        }
        int down = 0;
        int right = 0;
        
        down = obstaclePathCounts(i+1, j, maze, processed+'D');
        right = obstaclePathCounts(i, j+1, maze, processed+'R');
        return down+right;
    }
    
    public static int  backTracking(boolean[] [] maze, int i, int j, String processed) {
     
        if (i == 3 || j == 3){
            return 0;
        }
        
        if(i == maze.length-1 && j == maze[0].length-1){
            System.out.println(processed);
            return 1;
        }
        
    
        return backTracking(maze, i+1, j, processed+'D') + backTracking(maze, i, j+1, processed+'R');
    }
}
