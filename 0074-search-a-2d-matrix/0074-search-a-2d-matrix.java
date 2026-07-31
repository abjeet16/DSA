class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length , rows = matrix.length;
        int left = 0  , right = rows*cols-1;
        while (left<=right){
            int mid = (left+right)/2;
            int i = mid/cols , j = mid%cols;
            if (target==matrix[i][j]){
                return true;
            } else if (target<matrix[i][j]) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }
}