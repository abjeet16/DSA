class Solution {
  public static int maxIncreasingSubarrays(List<Integer> nums) {
        int prevLen = 1;
        int currLen = 1;
        int res = 0;
        int n = nums.size();
        for (int i = 1 ; i < n;i++){
            if (nums.get(i-1)<nums.get(i)){
                currLen++;
            }else {
                res = Math.max(res,currLen/2);
                res = Math.max(res,Math.min(prevLen,currLen));
                prevLen = currLen;
                currLen = 1;
            }
        }
        res = Math.max(res,currLen/2);
        res = Math.max(res,Math.min(prevLen,currLen));
        return res;
    }

}