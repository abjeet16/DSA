class NumMatrix {
    int[][] mat;
    int m;
    int n;
    public NumMatrix(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        mat = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            int sum = 0;
            for(int j = 0 ; j < n ; j++){
                sum += matrix[i][j];
                mat[i][j] = sum;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for(int i = row1 ; i <= row2 ; i++){
            res+=(mat[i][col2] - (col1 > 0 ? mat[i][col1 - 1] : 0));
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */