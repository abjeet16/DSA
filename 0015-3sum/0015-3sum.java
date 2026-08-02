class Solution {
   public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // move l and r past duplicates
                    int lv = nums[l], rv = nums[r];
                    while (l < r && nums[l] == lv) l++;
                    while (l < r && nums[r] == rv) r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
    
}