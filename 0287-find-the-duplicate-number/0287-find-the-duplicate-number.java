class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] freq = new boolean[nums.length];
        for(int i : nums){
            if(freq[i-1])return i;
            freq[i-1]=true;
        }
        return -1;
    }
}