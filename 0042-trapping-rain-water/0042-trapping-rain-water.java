class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] suffixMax = new int[n];
        for (int i = n-2 ; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1],height[i+1]);
        }
        int res = 0;
        int leftMax = height[0];
        for (int i = 1 ; i < n-1 ; i++){
            res+=Math.max(Math.min(leftMax,suffixMax[i])-height[i],0);
            leftMax = Math.max(leftMax,height[i]);
        }
        return res;
    }
}