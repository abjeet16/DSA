class Solution {
    public static int minCost(String colors, int[] neededTime) {
        int len = colors.length();
        if (len == 1)
            return 0;
        int res = 0;
        int maxCost = neededTime[0];
        for (int i = 1 ; i < len ; i++){
            if (colors.charAt(i)==colors.charAt(i-1)){
                res+=Math.min(maxCost,neededTime[i]);
                maxCost = Math.max(maxCost,neededTime[i]);
            }else{
                maxCost=neededTime[i];
            }
        }
        return res;
    }
}