class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int desc = 1;
        int asc = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i-1]>nums[i]){
                asc++;
                desc=1;
            }else if(nums[i-1]<nums[i]){
                desc++;
                asc=1;
            }else{
                desc=1;
                asc=1;
            }
            max = Math.max(max,Math.max(asc,desc));
        }
        return max;
    }
}