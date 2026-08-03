class Solution {
    public static double findMedianSortedArrays(int[] a, int[] b) {
        // Make sure array a is the smaller one to minimize binary search range
        if (a.length > b.length) return findMedianSortedArrays(b, a);

        int n = a.length, m = b.length;
        int low = 0 , high = n;

        while(low <= high){

            int c1 = (low+high)/2;
            int c2 = (n+m+1)/2 - c1;

            int l1 = c1==0 ?Integer.MIN_VALUE:a[c1-1];
            int l2 = c2==0 ?Integer.MIN_VALUE:b[c2-1];
            int r1 = c1==n ?Integer.MAX_VALUE:a[c1];
            int r2 = c2==m ?Integer.MAX_VALUE:b[c2];

            if(l1<=r2&&l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return Math.max(l1,l2);
                }
            }else if(l1>r2){
                high = c1-1;
            }else{
                low = c1+1;
            }
        }

        return 0.0;
    }
}