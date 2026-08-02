class Solution {
    public int alternatingSum(int[] nums) {
        int res = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            if (i%2==0)
                res+=nums[i];
            else 
                res-=nums[i];
        }
        return res;
    }
}