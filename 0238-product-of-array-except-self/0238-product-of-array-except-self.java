class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] pos = new int[n];
        pre[0]=nums[0];
        pos[n-1]=nums[n-1];
        for(int i = 1 ; i < n ; i++){
            pre[i] = pre[i-1]*nums[i];
            pos[n-i-1] = pos[n-i]*nums[n-i-1];
        }
        int[] res = new int[n];
        for(int i = 1 ; i < n-1 ; i++){
            res[i] = pre[i-1]*pos[i+1];
        }
        res[0] = pos[1];
        res[n-1] = pre[n-2];
        return res;
    }
}