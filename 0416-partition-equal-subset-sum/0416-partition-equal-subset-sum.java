class Solution {
    Boolean[][] memo;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        memo = new Boolean[nums.length][target + 1];

        return dfs(0, 0, target, nums);
    }

    private boolean dfs(int i, int curr, int target, int[] nums) {
        if (curr == target) return true;
        if (i == nums.length || curr > target) return false;

        if (memo[i][curr] != null)
            return memo[i][curr];

        boolean take = dfs(i + 1, curr + nums[i], target, nums);
        boolean skip = dfs(i + 1, curr, target, nums);

        return memo[i][curr] = take || skip;
    }
}