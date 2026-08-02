class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApple = 0;
        for(int i : apple){
            totalApple+=i;
        }
        Arrays.sort(capacity);
        for(int i = capacity.length-1;i>=0;i--){
            totalApple-=capacity[i];
            if(totalApple<1){
                return capacity.length-i;
            }
        }
        return -1;
    }
}