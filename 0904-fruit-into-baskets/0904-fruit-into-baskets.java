class Solution {
    public int totalFruit(int[] fruit) {
        int lastFruit = -1 , secondLastFruit = -1;
        int lastFruitStreak = 0;
        int max = 0;
        int curr = 0;
        for(int f : fruit){
            if(f == lastFruit || f == secondLastFruit){
                curr++;
            }else{
                curr = lastFruitStreak+1;
            }
            if(f==lastFruit){
                lastFruitStreak++;
            }else{
                lastFruitStreak = 1;
                secondLastFruit = lastFruit;
                lastFruit = f;
            }
            max = Math.max(max,curr);
        }
        return max;
    }
}