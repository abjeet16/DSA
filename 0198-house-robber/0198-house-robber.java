class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len==1)
            return nums[0];
        int[] tab = new int[len];
        tab[0]=nums[0];
        tab[1]=Math.max(nums[0],nums[1]);
        for (int i = 2 ; i < len ; i++){
            tab[i] = Math.max(
                    tab[i-1],
                    nums[i]+tab[i-2]
            );
        }
        return tab[len-1];
    }
}