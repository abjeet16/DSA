import java.util.Arrays;

class Solution {
    public int maxProfit(int[] p) {
        int[][][] memo = new int[p.length][2][3];
        for (int[][] layer : memo) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }
        return get(p, 0, true, 0, memo);
    }
    private int get(int[] p, int i, boolean isbuy, int sc, int[][][] memo) {
        if (sc == 2 || i == p.length) return 0;
        
        int state = isbuy ? 1 : 0;
        if (memo[i][state][sc] != -1) return memo[i][state][sc];
        
        int res = 0;
        if (isbuy) {
            int skip = get(p, i + 1, isbuy, sc, memo);
            // BUY: We subtract p[i] immediately
            int buy = -p[i] + get(p, i + 1, !isbuy, sc, memo);
            res = Math.max(skip, buy);
        } else {
            int skip = get(p, i + 1, isbuy, sc, memo);
            // SELL: We add p[i] immediately and increment sc
            int sell = p[i] + get(p, i + 1, !isbuy, sc + 1, memo);
            res = Math.max(skip, sell);
        }
        
        return memo[i][state][sc] = res;
    }
}