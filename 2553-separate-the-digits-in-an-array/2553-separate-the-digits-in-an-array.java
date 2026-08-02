class Solution {
    public int[] separateDigits(int[] nums) {
        int noe = 0;
        for(int i :  nums){
            while(i!=0){
                i/=10;
                noe++;
            }
        }
        int[] res = new int[noe];
        for(int i = nums.length-1 ; i>= 0 ; i--){
            while(nums[i]!=0){
                res[--noe] = nums[i]%10;
                nums[i]/=10;
            }
        }
        return res;
    }
}