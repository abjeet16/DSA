class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int max2 = Integer.MIN_VALUE;
        for(int i = 1;i<nums.length ;i++){
            if(nums[i]>nums[max]){
                max2 = nums[max];
                max = i;
            }else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return nums[max]>=max2*2?max:-1;
    }
}