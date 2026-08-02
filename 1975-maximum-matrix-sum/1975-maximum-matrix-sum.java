class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int negCount = 0;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        for (int[] row : matrix){
            for (int i : row){
                if (i<0)
                    negCount++;
                i=Math.abs(i);
                min = Math.min(min,i);
                sum+=i;
            }
        }
        if (negCount%2!=0)
            sum-= 2L *min;
        return sum;
    }
}