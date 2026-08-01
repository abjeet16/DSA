class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int n = nums.length;
        int prefix = 1;
        int sufix = 1;
        for(int i = 0 ; i < n ; i++){
            if(prefix == 0)prefix =1;
            if(sufix == 0)sufix = 1;
            prefix*=nums[i];
            sufix*=nums[n-1-i];
            res = Math.max(res,Math.max(prefix,sufix));
        }
        return res;
    }
}