class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closed =  nums[0]+nums[1]+nums[nums.length-1];
        for (int k = 0 ; k < nums.length-1;k++){
            int num1 = nums[k];
            int i = k+1;
            int j = nums.length-1;
            while (i < j){
                int sum = num1+nums[i]+nums[j];
                if (sum==target)
                    return sum;
                if (Math.abs(target-sum)<Math.abs(target-closed)) {
                    closed = sum;
                }
                if (sum < target)
                    i++;
                else
                    j--;
            }
        }
        return closed;
    }
}