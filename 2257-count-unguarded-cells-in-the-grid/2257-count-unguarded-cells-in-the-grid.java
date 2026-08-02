class Solution {
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] map = new int[m][n];
        for (int[] wall : walls){
            map[wall[0]][wall[1]] = 2;
        }
        for (int[] guard : guards){
            map[guard[0]][guard[1]] = 3;
        }
        for (int[] guard : guards){
            int i = guard[0] , j = guard[1];
            markGuardView(map,i-1,j,1,m,n);
            markGuardView(map,i+1,j,2,m,n);
            markGuardView(map,i,j-1,3,m,n);
            markGuardView(map,i,j+1,4,m,n);
        }
        int res = 0;

        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                if (map[i][j]==0)
                    res++;
            }
        }
        return res;
    }

    private static void markGuardView(int[][] map, int i , int j,int dir, int m, int n) {
        if (i<0||j<0||i==m||j==n||map[i][j]>1)
            return;
        map[i][j]=1;
        if (dir==1)markGuardView(map,i-1,j,1,m,n);
        else if (dir==2)markGuardView(map,i+1,j,2,m,n);
        else if (dir==3)markGuardView(map,i,j-1,3,m,n);
        else markGuardView(map,i,j+1,4,m,n);
    }
}