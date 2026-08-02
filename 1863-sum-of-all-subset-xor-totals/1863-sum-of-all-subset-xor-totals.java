class Solution {
    public static int subsetXORSum(int[] nums) {
        return getSum(nums,0,0);
    }

    private static int getSum(int[] nums, int i,int res) {
        if (i == nums.length){
            return res;
        }
        return getSum(nums,i+1,res^nums[i])+getSum(nums,i+1,res);
    }
}