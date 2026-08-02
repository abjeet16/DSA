class Solution {
    public int[] finalPrices(int[] prices){
        Stack<Integer> ms = new Stack<>();
        int len = prices.length;
        ms.add(0);
        for (int i = 1; i < len; i++) {
            while (!ms.isEmpty()&&prices[ms.peek()]>=prices[i]){
                int idx = ms.pop();
                prices[idx]-=prices[i];
            }
            ms.push(i);
        }
        return prices;
    }
}