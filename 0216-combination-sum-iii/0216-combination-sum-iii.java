class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        generate(res,new ArrayList<Integer>(),1,k,n);
        return res;
    }

    private void generate(List<List<Integer>> res, ArrayList<Integer> curr,int i , int numRem, int target) {
        if (target==0&&numRem==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if (target<0||i==10)
            return;
        generate(res, curr, i+1, numRem, target);
        curr.add(i);
        generate(res, curr, i+1, numRem-1, target-i);
        curr.removeLast();
    }
}