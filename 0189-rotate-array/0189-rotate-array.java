class Solution {
   public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }
        int[] arr = new int[k];
        for(int i = 0;i<k ;i++){
            arr[i] = nums[nums.length-k+i];
        }
        for(int i = nums.length-1-k;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for (int i = 0;i<k;i++){
            nums[i] = arr[i];
        }
    }
}