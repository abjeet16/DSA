class Solution {
    public long minCost(String s, int[] cost) {
        long[] charCost = new long[26];
        long total = getTotal(cost,charCost,s);
        long min = Long.MAX_VALUE;
        for (int i = 0 ; i < cost.length ; i++){
            min = Math.min(min,total-charCost[s.charAt(i)-'a']);
        }
        return min;
    }

    private long getTotal(int[] cost, long[] costMap, String s) {
        long sum = 0;
        for (int i = 0 ; i < cost.length ; i++){
            sum+=cost[i];
            costMap[s.charAt(i)-'a']+=cost[i];
        }
        return sum;
    }
}