class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1;i < n ;i++){
            for (int j = i+1 ; j < n ; j++){
                int sqr = i*i+j*j;
                int root = (int) Math.sqrt(sqr);
                if (root*root==sqr&&root<=n){
                    count+=2;
                }
            }
        }
        return count;
    }
}