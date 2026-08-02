class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            if(words[i].equals(target)){
                int forword = Math.abs(i-startIndex);
                int backWord = n - forword;
                res = Math.min(res,Math.min(forword,backWord));
            }
        }
        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }
}