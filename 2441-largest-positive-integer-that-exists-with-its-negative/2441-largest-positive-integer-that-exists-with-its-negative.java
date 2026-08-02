class Solution {
    public int findMaxK(int[] nums) {
        boolean[] neg = new boolean[1001];
        boolean[] pos = new boolean[1001];
        int max = -1;
        for (int ele : nums){
            int absVal = Math.abs(ele);
            if (ele>0)
                pos[absVal]=true;
            else
                neg[absVal]=true;
            if (neg[absVal]&&pos[absVal]&&absVal>max)
                max = absVal;
        }
        return max;
    }
}