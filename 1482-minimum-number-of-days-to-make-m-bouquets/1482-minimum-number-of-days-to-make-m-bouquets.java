class Solution {
    public int minDays(int[] bloomDay, int bouquets, int flowerCount) {
        int left = 1;
        int right = findMax(bloomDay);
        int res = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (canMakeBouquets(bloomDay,mid,bouquets,flowerCount)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private boolean canMakeBouquets(int[] bloomDay, int mid, int bouquets, int flowerCount) {
        int flowerDone = 0;
        for (int ele : bloomDay){
            if (ele<=mid){
                flowerDone++;
            }else {
                flowerDone = 0;
            }
            if (flowerDone==flowerCount) {
                bouquets--;
                flowerDone = 0;
            }
            if (bouquets==0){
                return true;
            }
        }
        return false;
    }

    private int findMax(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int ele : bloomDay)
            max = Math.max(ele,max);
        return max;
    }
}