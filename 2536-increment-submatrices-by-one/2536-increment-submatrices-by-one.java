class Solution {
    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for (int[] opration : queries){
            doQuerie(mat,opration[0],opration[1],opration[2],opration[3]);
        }
        for (int i = 0; i < n ; i ++){
            for(int j = 1;j<n;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        return mat;
    }

    private static void doQuerie(int[][] mat, int startX, int startY, int endX, int endY) {
        for (int i = startX;i <=  endX ; i++){
            mat[i][startY]++;
            if (endY!=mat.length-1)
                mat[i][endY+1]--;
        }
    }
}