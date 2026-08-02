class Solution {
    public boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums)max=Math.max(max,i);
        int freq[] = new int[max+1];
        for(int i : nums)freq[i]++;
        for(int i = 1;i<max;i++)if(freq[i]!=1)return false;
        return freq[max]==2;
    }
}