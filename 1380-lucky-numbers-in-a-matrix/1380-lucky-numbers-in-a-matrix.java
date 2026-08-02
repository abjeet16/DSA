class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        for (int[] row : matrix) {
            int minIndex = getMaxIndex(row);
            if (isTheColsMax(minIndex,row[minIndex],matrix)){
                res.add(row[minIndex]);
                break;
            }
        }
        return res;
    }

    private boolean isTheColsMax(int col, int target, int[][] matrix) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (target<matrix[i][col]){
                return false;
            }
        }
        return true;
    }

    private int getMaxIndex(int[] row) {
        int n = row.length;
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (row[res] > row[i]) {
                res = i;
            }
        }
        return res;
    }
}