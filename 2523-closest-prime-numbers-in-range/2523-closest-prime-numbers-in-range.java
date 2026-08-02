class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] com = new boolean[right+1];
        com[0]=true;
        com[1]=true;
        for(int i = 2;i<=right;i++){
            for(int j = i+i ; j <= right ; j+=i){
                com[j] = true;
            }
        }
        int[] res = new int[]{-1,-1};
        int prev = -1;
        int diff = -1;
        while(left<=right){
            if(!com[left]){
                if(prev==-1){
                    prev = left;
                }else if(diff==-1||left-prev<diff){
                    res[0] = prev;
                    res[1] = left;
                    diff = left-prev;
                }
                prev = left;
            }
            left++;
        }
        return res;
    }
}