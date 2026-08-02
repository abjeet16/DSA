class Solution {
    public int findKthLargest(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num: nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] freq = new int[max-min+1];
        for(int i =0; i< nums.length; i++){
            freq[nums[i]-min]++;
        }

        for(int i = freq.length-1; i>=0; i--){
            k = k-freq[i];
            if(k<=0){
                return min + i;
            }
        }
        return -1;
    }
}