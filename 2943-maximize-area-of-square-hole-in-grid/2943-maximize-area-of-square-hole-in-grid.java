class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxConH = 1;
        int maxCOnV = 1;

        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int curr = 1;
        for (int i = 1 ; i < hBars.length ; i ++){
            if (hBars[i]-hBars[i-1]==1)
                curr++;
            else
                curr=1;
            maxConH=Math.max(maxConH,curr);
        }
        curr = 1;
        for (int i = 1 ; i < vBars.length ; i ++){
            if (vBars[i]-vBars[i-1]==1)
                curr++;
            else
                curr=1;
            maxCOnV = Math.max(maxCOnV,curr);
        }
        int res = Math.min(maxConH,maxCOnV)+1;
        return res*res;
    }
}