class Solution {
    public int countOdds(int low, int high) {
        if(low%2!=0)
            low--;
        if (high%2!=0)
            high++;
        int diff = high-low;
        return diff/2;
    }
}