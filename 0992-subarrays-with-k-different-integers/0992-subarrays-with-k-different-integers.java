class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        int left = 0;
        int right = 0;
        int distinct = 0;
        int prefix = 0;
        int ans = 0;

        while (right < n) {
            if (freq[nums[right]] == 0) distinct++;
            freq[nums[right]]++;

            // Shrink if more than k distinct
            if (distinct > k) {
                while (distinct > k) {
                    freq[nums[left]]--;
                    if (freq[nums[left]] == 0) {
                        distinct--;
                    }
                    left++;
                }
                prefix = 0;
            }

            // Remove extra duplicates from left
            while (left < right && freq[nums[left]] > 1) {
                freq[nums[left]]--;
                left++;
                prefix++;
            }

            if (distinct == k) {
                ans += prefix + 1;
            }

            right++;
        }

        return ans;
    }
}