class Solution {
    public static int totalMoney(int n) {
        int base = 0,res = 0;
        while (n!=0){
            int limit = Math.min(7,n);
            for (int i = 1 ; i <=  limit; i++){
                res+=base+i;
            }
            n-=limit;
            base++;
        }
        return res;
    }
}