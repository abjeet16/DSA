class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        getPowerSet(res,new ArrayList<Integer>(),0,nums);
        return res;
    }

    private void getPowerSet(List<List<Integer>> res, ArrayList<Integer> curr, int start, int[] nums) {
        res.add(new ArrayList<>(curr));
        for (int i = start ; i < nums.length ; i++){
            if (i>start&&nums[i]==nums[i-1])continue;
            curr.add(nums[i]);
            getPowerSet(res, curr, i+1, nums);
            curr.removeLast();
        }
    }
}