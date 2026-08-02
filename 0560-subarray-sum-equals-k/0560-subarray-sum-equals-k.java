class Solution {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixCount = new HashMap<>();
        prefixCount.put(0,1);
        int res = 0;
        int sum = 0;
        for (int i : nums){
            sum+=i;
            if (prefixCount.containsKey(sum-k)){
                res+=prefixCount.get(sum-k);
            }
            prefixCount.put(sum, prefixCount.getOrDefault(sum,0)+1);
        }
        return res;
    }
}