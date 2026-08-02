class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int right = getMaxValue(piles);
        int left = 1 , res = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if (canHeEat(mid,piles,h)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private static int getMaxValue(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int ele : piles)
            max = Math.max(ele,max);
        return max;
    }

    private static boolean canHeEat(int eatPerHour, int[] piles, int maxHours) {
        int hoursTaken = 0;
        for (int ele : piles){
            hoursTaken+= ele / eatPerHour;
            if (ele %eatPerHour!=0){
                hoursTaken++;
            }
            if (hoursTaken>maxHours)
                return false;
        }
        return true;
    }
}