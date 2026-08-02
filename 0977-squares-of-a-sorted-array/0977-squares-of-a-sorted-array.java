class Solution {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int right = 0;
        int left = nums.length-1;
        int resIndex = nums.length-1;
        while (right < left && resIndex < nums.length){
            int rightProduct = nums[right]*nums[right];
            int leftProduct = nums[left]*nums[left];
            if (leftProduct>rightProduct){
                res[resIndex] = leftProduct;
                resIndex--;left--;
            } else if (rightProduct==leftProduct) {
                res[resIndex] = rightProduct;
                resIndex--;right++;
                res[resIndex] = leftProduct;
                resIndex--;left--;
            } else {
                res[resIndex] = rightProduct;
                resIndex--;right++;
            }
        }
        if (resIndex==0){
            res[resIndex] = nums[right]*nums[left];
        }
        return res;
    }
}