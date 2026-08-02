class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            res = Math.max(res,nums[left++]+nums[right--]);
        }
        return res;
    }
}