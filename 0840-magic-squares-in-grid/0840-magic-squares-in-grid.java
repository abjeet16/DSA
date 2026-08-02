class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(int i = 0 ; i < m-2 ; i++){
            for(int j = 0 ; j < n-2 ;j++){
                if(check(grid,i,j)){
                    res++;
                }
            }
        }
        return res;
    }
    boolean check(int[][] grid,int i,int j){
        int d1 = 0,d2=0,s1=0,s2=0,s3=0,s4=0,s5=0,s6=0;
        boolean[] used = new boolean[10];
        for(int x = 0 ; x < 3 ;x++){
            for(int y = 0 ; y < 3 ; y++){
                if(grid[i+x][j+y]==0||grid[i+x][j+y]>9)
                    return false;
                if(used[grid[i+x][j+y]])
                    return false;
                used[grid[i+x][j+y]]=true;
            }
            d1+=grid[i+x][j+x];
            s1+=grid[i+x][j];
            s2+=grid[i+x][j+1];
            s3+=grid[i+x][j+2];
            s4+=grid[i][j+x];
            s5+=grid[i+1][j+x];
            s6+=grid[i+2][j+x];
        }
        d2+=grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2];
        return (d1==d2)&&(d1==s1)&&d1==s2&&d1==s3&&d1==s3&&d1==s4&&d1==s5&&d1==s6;
    }
}