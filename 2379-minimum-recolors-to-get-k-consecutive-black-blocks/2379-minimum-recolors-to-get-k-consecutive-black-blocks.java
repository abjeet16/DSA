class Solution {
    public int minimumRecolors(String blocks, int k) {
        int currCon = 0;
        for (int  i = 0 ; i < k ; i++){
            if (blocks.charAt(i)=='W')
                currCon++;
        }
        int minCon = currCon;
        for (int i = k ; i < blocks.length();i++){
            if (blocks.charAt(i-k)=='W')
                currCon--;
            if (blocks.charAt(i)=='W')
                currCon++;
            minCon = Math.min(currCon,minCon);
        }
        return minCon;
    }
}