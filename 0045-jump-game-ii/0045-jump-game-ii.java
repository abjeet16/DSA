class Solution {
    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return get(nums,0,memo);
    }
    private int get(int[] n,int i,int[] memo){
        int l = n.length;
        if(i==l-1)return 0;
        if(memo[i]!=-1)return memo[i];

        int res = l*1000;

        for(int j = 1;j<=n[i];j++){
            if(i+j<l)
                res = Math.min(res,1+get(n,i+j,memo));
        }

        return memo[i] = res;
    }
}