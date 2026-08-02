class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            res[i] = nums[i];
            res[i+len] = nums[i];
        }
        return res;
    }
}