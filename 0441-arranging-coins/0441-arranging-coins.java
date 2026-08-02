class Solution {
    public int arrangeCoins(int n) {
        int count = 1;
        while(count<=n){
            n-=count;
            count++;
        }
        return count-1;
    }
}