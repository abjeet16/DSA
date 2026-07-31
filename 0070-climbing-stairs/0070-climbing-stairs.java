class Solution {
    static int[] memo;
    static {
        memo = new int[46];
        Arrays.fill(memo,-1);
    }
    public static int climbStairs(int n) {
        if (memo[n]!=-1)
            return memo[n];
        if (n==0||n==1){
            return 1;
        }
        int take1 = climbStairs(n-1);
        int take2 = climbStairs(n-2);
        return memo[n]=take1+take2;
    }
}