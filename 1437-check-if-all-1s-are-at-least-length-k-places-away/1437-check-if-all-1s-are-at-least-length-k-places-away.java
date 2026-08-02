class Solution {
    public static boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            if (nums[i]==1) {
                if (hasOne(nums, i + 1, Math.min(i+k+1, len))) {
                    return false;
                }else {
                    i+=k;
                }
            }
        }
        return true;
    }

    private static boolean hasOne(int[] nums, int i, int j) {
        while (i<j){
            if (nums[i]==1)
                return true;
            i++;
        }
        return false;
    }

}