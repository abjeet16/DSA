class Solution {
    public static int numIslands(char[][] grid) {
       int count = 0;
       int row = grid.length , col = grid[0].length;
       boolean[][] visited = new boolean[row][col];

       for (int i = 0 ; i < row ; i ++){
           for (int j = 0 ; j < col ; j ++){
               if (grid[i][j]=='1'&& !visited[i][j]) {
                   dfs(i, j, row, col, grid, visited);
                   count++;
               }
           }
       }
       return count;
    }

    private static void dfs(int i, int j, int row, int col, char[][] grid, boolean[][] visited) {
        if (i<0||j<0||i>=row||j>=col||visited[i][j]||grid[i][j]=='0')
            return;

        visited[i][j] = true;

        dfs(i,j+1,row,col,grid,visited);//right
        dfs(i,j-1,row,col,grid,visited);//left
        dfs(i-1,j,row,col,grid,visited);//up
        dfs(i+1,j,row,col,grid,visited);//down
    }
    
}