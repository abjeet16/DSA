class Solution {
    public static boolean search(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            int midValue = nums[mid];
            if (midValue==target){
                return true;
            }
            if (nums[left]==midValue&&midValue==nums[right]){
                left++;right--;
            } else if (midValue>=nums[left]) {
                if (target>=nums[left]&&target<=midValue){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (target<=nums[right]&&target>=midValue){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return false;
    }
}