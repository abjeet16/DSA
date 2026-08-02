class Solution {
    public int findFinalValue(int[] nums, int target) {
        boolean[] seen =  new boolean[1001];
        for(int num : nums){
            seen[num]=true;
        }
        while(target<1001&&seen[target])
            target*=2;
        return target;
    }
}