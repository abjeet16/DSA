class Solution {
    public int minDifficulty(int[] jd, int d) {
        if(d>jd.length)return -1;
        int[][] memo = new int[jd.length][d+1];
        for(int[] row : memo)Arrays.fill(row,-1);
        return find(jd,d,0,memo);
    }
    int find(int[] jd,int d,int i,int[][] memo){
        if(d==1){
            return findMaxInRem(jd,i);
        }
        if(memo[i][d]!=-1)return memo[i][d];
        int currMax = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        for(int j = i ; j <= jd.length-d ; j++){
            currMax = Math.max(currMax,jd[j]);
            res = Math.min(res,currMax+find(jd,d-1,j+1,memo));
        }
        return memo[i][d]=res;
    }
    int findMaxInRem(int[] jd,int i){
        int max = -1;
        while(i<jd.length){
            max=Math.max(max,jd[i]);
            i++;
        }
        return max;
    }
}