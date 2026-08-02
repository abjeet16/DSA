class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int right = findMax(nums) , left = 1;
        int res = 0 ;
        while (left <= right){
            int mid = (left+right)/2;
            if (canDiv(nums,mid,threshold)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private static boolean canDiv(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int ele : nums){
            sum+=ele/divisor;
            if (ele%divisor!=0)
                sum++;
            if (sum>threshold)
                return false;
        }
        return true;
    }

    private int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int ele : nums)
            max = Math.max(ele,max);
        return max;
    }
}