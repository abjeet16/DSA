class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Loop through each plot in the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            
            // Check if the current plot is empty (0)
            if (flowerbed[i] == 0) {
                
                // Check the left plot:
                // - If it's the first plot (i == 0), no left neighbor exists → safe
                // - Or if the left plot is empty (flowerbed[i - 1] == 0)
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                
                // Check the right plot:
                // - If it's the last plot (i == flowerbed.length - 1), no right neighbor exists → safe
                // - Or if the right plot is empty (flowerbed[i + 1] == 0)
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                // If both sides are empty, we can plant a flower here
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Place the flower
                    n--;              // One less flower to plant
                    
                    // Optional optimization: skip the next plot since we just planted one
                    // i++; 
                }
            }
        }
        
        // If we planted all required flowers (n <= 0), return true
        return n <= 0;
    }
}
