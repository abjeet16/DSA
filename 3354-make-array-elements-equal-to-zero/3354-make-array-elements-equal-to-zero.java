class Solution {
    public static int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        // Build left[] as prefix sum
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }

        // Build right[] as suffix sum
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }

        // Check valid selections
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;

            if (left[i] == right[i]) {
                count += 2;
            } else if (Math.abs(left[i] - right[i]) == 1) {
                count += 1;
            }
        }

        return count;
    }

}