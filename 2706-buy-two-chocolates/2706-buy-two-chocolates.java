class Solution {
    public static int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
        for (int ele : prices)
            if (ele<=min){
                min2 = min;
                min = ele;
            }else if (ele<min2)
                min2=ele;
        if (min+min2<=money)
            return money-(min+min2);
        else
            return money;
    }
}