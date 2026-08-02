class Solution {
    public boolean check(int[] nums) {
        boolean gotRotated = false;
        int len = nums.length;
        for (int i = 1;i<len;i++){
            if (nums[i-1]>nums[i]){
                if (gotRotated)
                    return false;
                gotRotated = true;
            }
        }
        return nums[len - 1] <= nums[0]||!gotRotated;
    }
}