class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        find(res,nums,new ArrayList<>(),0,new boolean[nums.length]);
        return res;
    }
    private void find(List<List<Integer>> res,int[] nums,List<Integer> curr,int i,boolean[] seen){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int j = 0 ; j < nums.length ; j++){
            if(!seen[j]){
                seen[j]=true;
                curr.add(nums[j]);
                find(res,nums,curr,i+1,seen);
                curr.removeLast();
                seen[j]=false;
            }
        }
    }
}