class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long low = 0,high = 0;
        for (int i : batteries){
            if (low>i)
                low=i;
            high+=i;
        }
        high/=n;
        long res = 0;
        while (low<=high){
            long mid = (low+high)/2;
            if (check(mid,batteries,n)) {
                res = mid;
                low=mid+1;
            }else {
                high = mid-1;
            }
        }
        return res;
    }

    private boolean check(long mid, int[] batteries, int n) {
        long target = mid*n;
        for (int i : batteries){
            target-=Math.min(i,mid);
            if (target<=0) return true;
        }
        return target<=0;
    }
}