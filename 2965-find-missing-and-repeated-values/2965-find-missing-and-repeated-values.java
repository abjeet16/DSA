class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] seen = new boolean[2500];
        int[] res = new int[2];
        for (int[] row : grid){
            for (int e : row){
                if (seen[e-1]){
                    res[0]=e;
                    continue;
                }
                seen[e-1]=true;
            }
        }
        for (int i = 0 ; i < 2500 ; i++){
            if (!seen[i]){
                res[1]=i+1;
                break;
            }
        }
        return res;
    }
}