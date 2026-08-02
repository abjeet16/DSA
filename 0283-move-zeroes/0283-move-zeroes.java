class Solution {
    public void moveZeroes(int[] nums) {
        int insertIndex = 0;
        for (int i : nums){
            if (i!=0){
                nums[insertIndex]=i;
                insertIndex++;
            }
        }
        int len = nums.length;
        for (int i = insertIndex ; i < len ; i++){
            nums[i]=0;
        }
    }
}