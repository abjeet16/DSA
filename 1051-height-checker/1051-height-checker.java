class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int len = heights.length;
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        for(int i = 0 ; i < len ; i++){
            if(sorted[i]!=heights[i])
                res++;
        }
        return res;
    }
}