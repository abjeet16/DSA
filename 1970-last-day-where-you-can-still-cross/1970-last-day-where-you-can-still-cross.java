class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int right = cells.length,left = 0;
        int res = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if(check(mid,cells,row,col)){
                res = mid;
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return res;
    }

    private boolean check(int max, int[][] cells, int row, int col) {
        boolean[][] grid = new boolean[row][col];
        boolean[][] vis = new boolean[row][col];

        for (int i = 0 ; i < max ; i++){
            int r = cells[i][0]-1;
            int c = cells[i][1]-1;
            grid[r][c] = true;
        }

        for (int i = 0 ; i < col ; i++){
            if (vaild(0,i,grid,vis)){
                return true;
            }
        }
        return false;
    }

    private boolean vaild(int i, int j, boolean[][] grid, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;

        if (i<0||i>=m||j<0||j>=n)
            return false;

        if (grid[i][j]||vis[i][j])
            return false;

        vis[i][j] = true;

        if (i==m-1)
            return true;

        return vaild(i+1,j,grid,vis)||
                vaild(i-1,j,grid,vis)||
                vaild(i,j+1,grid,vis)||
                vaild(i,j-1,grid,vis);
    }
}