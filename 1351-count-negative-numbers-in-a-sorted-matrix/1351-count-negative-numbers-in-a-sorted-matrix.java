class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int rows = grid.length , cols = grid[0].length;
        for (int[] ints : grid) {
            int left = 0, right = cols - 1;
            int firstNeg = cols;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (ints[mid] < 0) {
                    firstNeg = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            res += cols - firstNeg;
        }
        return res;
    }
}