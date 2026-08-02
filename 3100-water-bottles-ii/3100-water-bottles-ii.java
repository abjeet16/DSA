class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int emptyBottles = 0;
        while (numBottles!=0||emptyBottles>=numExchange){
            if(emptyBottles>=numExchange){
                numBottles++;
                emptyBottles-=numExchange;
                numExchange++;
            }else{
                emptyBottles+=numBottles;
                totalDrunk+=numBottles;
                numBottles=0;
            }
        }
        return totalDrunk;
    }
}