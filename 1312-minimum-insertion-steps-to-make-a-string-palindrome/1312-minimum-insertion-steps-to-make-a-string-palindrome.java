class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        for(int[] i : memo)Arrays.fill(i,Integer.MAX_VALUE);
        return get(s,0,s.length()-1,memo);
    }
    private int get(String s,int i,int j,int[][] memo){
        if(i>j)return 0;
        if(memo[i][j]!=Integer.MAX_VALUE)return memo[i][j];
        int res = Integer.MAX_VALUE;
        if(s.charAt(i)==s.charAt(j)){
            res = get(s,i+1,j-1,memo);
        }else{
            int left = get(s,i+1,j,memo);
            int right = get(s,i,j-1,memo);
            res = Math.min(res,1+Math.min(left,right));
        }
        return memo[i][j]=res;
    }
}