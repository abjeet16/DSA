class Solution {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int emptyBottles = 0;
        while (numBottles!=0){
            totalDrunk+=numBottles;
            int emptyThisTime = numBottles;
            numBottles = (numBottles+emptyBottles)/numExchange;
            emptyBottles =(emptyThisTime+emptyBottles)%numExchange;
        }
        return totalDrunk;
    }
}