class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean isPair = false;
        for(int i = 0 ; i < bits.length; i++){
            if(bits[i]==1){
                isPair = true;
                i++;
            }else{
                isPair = false;
            }
        }  
        return !isPair;     
    }
}