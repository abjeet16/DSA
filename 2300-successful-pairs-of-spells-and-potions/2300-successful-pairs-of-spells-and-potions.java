class Solution {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0 ; i < spells.length ; i++){
            spells[i] = SearchSuccessfulPair(spells[i],potions,success);
        }
        return spells;
    }

    private static int SearchSuccessfulPair(int spell, int[] potions, long success) {
        int right = potions.length-1 , left = 0 , res = 0 ;
        while (left<=right){
            int mid = (right+left)/2;
            if ((long) spell * potions[mid] >= success) {
                res = potions.length-mid;
                right = mid-1;
            } else {
                left = mid +1;
            }
        }
        return res;
    }
}