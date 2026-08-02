class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
            return image;
        fill(image[sr][sc],sr,sc,color,image);
        return image;
    }
    void fill(int prev,int i,int j,int color,int[][] image){
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=prev)
            return;
        image[i][j] = color;
        fill(prev,i+1,j,color,image);
        fill(prev,i-1,j,color,image);
        fill(prev,i,j+1,color,image);
        fill(prev,i,j-1,color,image);
    }
}