class Solution {
    public static int numberOfBeams(String[] bank) {
        int len = bank.length;
        int res = 0 ;
        int r1Count = 0;
        int r2Index = 0;
        while (r2Index<len){
            int r2Count = layersInRow(bank[r2Index]);
            if (r2Count!=0) {
                res += r1Count * r2Count;
                r1Count = r2Count;
            }
            r2Index++;
        }
        return res;
    }

    private static int layersInRow(String s) {
        int res = 0;
        for (char curr : s.toCharArray()){
            if (curr=='1')
                res++;
        }
        return res;
    }
}