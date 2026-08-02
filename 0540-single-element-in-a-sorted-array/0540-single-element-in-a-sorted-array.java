class Solution {
    public static int singleNonDuplicate(int[] nums) {
        if (nums.length==1)
            return nums[0];
        if (nums[0]!=nums[1])
            return nums[0];
        int right = nums.length-1;
        if (nums[right]!=nums[right-1])
            return nums[right];

        int left = 0 ; right = nums.length-2;
        ///  1,1,2,2,3,3,4,5,5,6,6,7,7
        while(left<=right){
            int mid = (left+right)/2;
            if (nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if (mid%2!=0){
                if (nums[mid-1]==nums[mid]){
                    left=mid+1;
                }else {
                    right = mid-1;
                }
            }else {
                if (nums[mid+1]==nums[mid]){
                    left = mid+1;
                }else {
                    right = mid+1;
                }
            }
        }
        return -1;
    }

}