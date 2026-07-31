class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getSubSets(res,new ArrayList<Integer>(),nums,0);
        return res;
    }

    private void getSubSets(List<List<Integer>> res, ArrayList<Integer> curr, int[] nums, int i) {
        if (i== nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        getSubSets(res, curr, nums, i+1);
        curr.removeLast();
        getSubSets(res, curr, nums, i+1);
    }
}