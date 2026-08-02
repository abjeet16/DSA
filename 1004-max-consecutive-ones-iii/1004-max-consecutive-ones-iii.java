class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int currCon = 0;
        int i = 0 , j = 0;
        int res = 0;
        while(i<len){
            if(nums[i]==0)currCon++;
            while(currCon>k){
                if(nums[j]==0)currCon--;
                j++;
            }
            res = Math.max(res,i-j+1);
            i++;
        }
        return res;
    }
}