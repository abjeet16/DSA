class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i ++){
            boolean[] row = new boolean[n+1];
            boolean[] col = new boolean[n+1];
            for(int j = 0 ; j < n ;j++){
                int num = matrix[i][j];
                int num1 = matrix[j][i];
                if(row[num]||col[num1])return false;
                row[num]=true;
                col[num1]=true;
            }
        }
        return true;
    }
}