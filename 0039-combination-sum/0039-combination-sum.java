class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        // Arrays.sort(candidates);
        
        helper(list, new ArrayList<>(), candidates, target, 0);
        
        return list;
    }
    
    public void helper( List<List<Integer>> OList, List<Integer> InList, int[] candidates, int target, int startPos)
    {
        if(target == 0)
        {
            OList.add(new ArrayList<>(InList));
            return;
        } else if(target < 0)
            return;
        
        for(int i=startPos; i<candidates.length; i++)
        {
            // if(candidates[i] > target)
            //     return;
            
            InList.add(candidates[i]);
            helper(OList, InList, candidates, target - candidates[i], i);
            InList.remove(InList.size() - 1);
        }
    }
}