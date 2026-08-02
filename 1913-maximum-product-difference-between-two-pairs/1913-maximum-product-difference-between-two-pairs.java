class Solution {
    public int maxProductDifference(int[] nums) {
        int min = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
        for (int ele :  nums){
            if (ele<=min){
                min2=min;
                min = ele;
            } else if (ele<min2) {
                min2=ele;
            }
            if (ele>=max){
                max2=max;
                max=ele;
            } else if (ele>max2) {
                max2=ele;
            }
        }
        return (max*max2)-(min*min2);
    }
}