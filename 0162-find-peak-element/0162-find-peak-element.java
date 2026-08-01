class Solution {
    public int findPeakElement(int[] nums) {
        int right = nums.length-1;
        if (right==0||nums[0]>nums[1])
            return 0;
        if (nums[right]>nums[right-1])
            return right;
        int left = 1;
        right--;
        while (left <= right){
            int mid = (left+right)/2;
            boolean rightSmall = nums[mid]>nums[mid-1];
            boolean leftSmall = nums[mid]>nums[mid+1];
            if (rightSmall&&leftSmall){
                return mid;
            }
            if (!leftSmall){
                left =mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}