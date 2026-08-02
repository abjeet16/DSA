class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        Integer[][] dp = new Integer[n][n + 1];
        return ans(nums, 0, -1, dp);
    }

    private int ans(int[] nums, int i, int prev, Integer[][] dp) {
        if (i == nums.length)
            return 0;

        if (dp[i][prev + 1] != null)
            return dp[i][prev + 1];

        int notTake = ans(nums, i + 1, prev, dp);

        int take = 0;
        if (prev == -1 || nums[i] > nums[prev]) {
            take = 1 + ans(nums, i + 1, i, dp);
        }

        return dp[i][prev + 1] = Math.max(take, notTake);
    }
}