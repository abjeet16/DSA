class Solution {
    public int passThePillow(int n, int time) {
        n--;
        int rounds = time/n;
        if (rounds%2!=0){
            return n+1-time%n;
        }else {
            return time%n+1;
        }
    }
}