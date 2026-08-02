class Solution {
    public int missingNumber(int[] nums) {
        int sumOfDigit = 0;
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i ++){
            sumOfDigit+=(i+1);
            sum+=nums[i];
        }
        return sumOfDigit-sum;
    }
}