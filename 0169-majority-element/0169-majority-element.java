class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 0;
        for(int i :  nums){
            if (count==0) {
                count = 1;
                res = i;
            }
            else if (i==res)
                count++;
            else
                count--;
        }
        return res;
    }
}