/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left = 1,right = n;
        long res = Integer.MAX_VALUE;
        while(left<=right){
            long mid = (left+right)/2;
            if(isBadVersion((int)mid)){
                res = mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return (int)res;
    }
}