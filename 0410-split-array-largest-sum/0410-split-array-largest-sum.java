class Solution {
    public static int splitArray(int[] nums, int k) {
        int left = Math.min(nums[0],nums[nums.length-1]);
        int right = sumOfElementInArr(nums);
        int res = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if (possiable(mid,nums,k)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private static boolean possiable(int maxSum, int[] nums, int k) {
        int currSum = 0 ;
        for (int ele : nums){
            if (ele>maxSum)
                return false;
            if (maxSum>=currSum+ele)
                currSum+=ele;
            else {
                k--;
                currSum = 0;
                currSum+=ele;
            }
        }
        return k>0;
    }

    private static int sumOfElementInArr(int[] nums) {
        int sum = 0;
        for (int ele : nums)
            sum+=ele;
        return sum;
    }
}