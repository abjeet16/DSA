class Solution {
    public static int maxArea(int[] height) {
        int maxWeight = 0;
        int i = 0 , j = height.length-1;
        while (i<j){
            int distance = j-i;
            int minHeight = Math.min(height[j],height[i]);

            maxWeight = Math.max(maxWeight,distance*minHeight);
            if (height[i]>height[j])
                j--;
            else
                i++;
        }
        return maxWeight;
    }
}