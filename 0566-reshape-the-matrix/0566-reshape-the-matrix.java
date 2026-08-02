class Solution {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length*mat[0].length!=r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        int resRow = 0 , resCol = 0;
        for (int[] row : mat){
            for (int element : row){
                if (resCol==c){
                    resRow++;
                    resCol= 0;
                }
                res[resRow][resCol] = element;
                resCol++;
            }
        }
        return res;
    }
}