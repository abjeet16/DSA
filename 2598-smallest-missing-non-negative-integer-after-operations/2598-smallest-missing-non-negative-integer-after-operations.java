class Solution {
    public static int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];
        for (int i = 0 ; i < nums.length ;  i ++){
            int rem = nums[i]%value;
            if (rem<0)
                rem+=value;
            count[rem]++;
        }
        int MEX = 0 ;
        while (count[MEX%value]>0){
            count[MEX%value]--;
            MEX++;
        }
        return MEX;
    }
}