class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int max = nums[0];
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i : nums){
            if (i>max){
                max3 = max2;
                max2 = max;
                max = i;
            } else if (i<max&&i>max2) {
                max3 = max2;
                max2 = i;
            } else if (i<max2&&i>max3) {
                max3 = i;
            }
        }
        if (max3==Long.MIN_VALUE){
            return max;
        }
        return (int) max3;
    }
}