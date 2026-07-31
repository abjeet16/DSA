class Solution {
    public void sortColors(int[] nums){
        int low = 0 , mid = 0 , high = nums.length-1;
        while (mid<=high){
            if (nums[mid]==0){
                swap(nums,mid,low);
                mid++;low++;
            } else if (nums[mid]==1) {
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int mid, int low) {
        int temp = nums[mid];
        nums[mid] = nums[low];
        nums[low] = temp;
    }
}