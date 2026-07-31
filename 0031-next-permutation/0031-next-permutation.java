class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first index 'i' from the right such that nums[i] > nums[i-1]
        int i = n - 1;
        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }

        // Step 2: If such an index exists, find element just larger than nums[i-1] from the right
        if (i != 0) {
            int index = i;
            for (int j = n - 1; j >= i; j--) {
                if (nums[j] > nums[i - 1]) {
                    index = j;
                    break;
                }
            }
            // Step 3: Swap
            swap(i-1,index,nums);
        }

        // Step 4: Reverse the suffix starting at position i
        rev(nums, i, n - 1);
    }

    private void rev(int[] nums, int start, int end) {
        while (start<end) {
            swap(start, end, nums);
            start++;end--;
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}