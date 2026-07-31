class Solution {
    public static int removeElement(int[] nums, int val) {
        int resIndex=0;
        for (int i : nums){
            if (i != val){
                nums[resIndex] = i;
                resIndex++;
            }
        }
        return resIndex;
    }
}