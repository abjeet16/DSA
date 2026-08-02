class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int len = s.length();
        int linesCount = 0;
        int pixelsLeft = 0;
        for (int i : s.toCharArray()){
            int width = widths[i-'a'];
            if (pixelsLeft+width<=100){
                pixelsLeft += widths[i-'a'];
            }else {
                pixelsLeft = width;
                linesCount++;
            }
        }
        return new int[]{++linesCount,pixelsLeft};
    }
}