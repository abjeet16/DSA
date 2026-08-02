class Solution {
    public static int triangleNumber(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int count =0;
        for (int k = nums.length-1;k>=2;k--){
            if (nums[k]==0)
                continue;
            int i = 0;
            int j = k-1;
            while (i<j){
                if (nums[i]+nums[j]>nums[k]){
                    count+=(j-i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}