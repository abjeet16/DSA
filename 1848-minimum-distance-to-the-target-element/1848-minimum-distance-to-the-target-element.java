class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i = start;
        int j = start;
        while(i>=0||j<nums.length){
            if(i>=0){
                if(nums[i]==target)return start-i;
            }
            if(j<nums.length){
                if(nums[j]==target)return j-start;
            }
            i--;
            j++;
        }
        return -1;
    }
}