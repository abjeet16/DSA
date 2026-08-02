class Solution {
    public String triangleType(int[] nums) {
        if(!check(nums))
            return "none";
        if(nums[0]==nums[1]&&nums[0]==nums[2])
            return "equilateral";
        else if(nums[0]==nums[1]||nums[0]==nums[2]||nums[1]==nums[2])
            return "isosceles";
        else
            return "scalene";
    }
    boolean check(int[] nums){
        return nums[0]+nums[1]>nums[2]&&
                nums[1]+nums[2]>nums[0]&&
                nums[0]+nums[2]>nums[1];
    }
}