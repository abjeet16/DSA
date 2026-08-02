class Solution {
    public int maxLength(List<String> arr) {
        boolean[] seen = new boolean[26];
        int res = 0;
        for(int i = 0 ; i < arr.size() ;i++){
            res = Math.max(res,find(arr,seen,i));
        }
        return res;
    }
    int find(List<String> arr,boolean[] seen,int i){
        if(i==arr.size())return 0;
        int res = 0;
        for(int j = i ; j < arr.size() ;j++){
            String w = arr.get(i);
            if(!isSeen(w,seen)){
                mark(w,seen);
                res = Math.max(res,w.length()+find(arr,seen,j+1));
                unmark(w,seen);
            }
        }
        return res;
    }
    boolean isSeen(String w,boolean[] seen){
        boolean[] cseen = new boolean[26];
        for(char ch : w.toCharArray()){
            if(seen[ch-'a']||cseen[ch-'a'])return true;
            cseen[ch-'a'] = true;
        }
        return false;
    }
    void mark(String s,boolean[] seen){
        for(char ch : s.toCharArray()){
            seen[ch-'a']=true;
        }
    }
    void unmark(String s,boolean[] seen){
        for(char ch : s.toCharArray()){
            seen[ch-'a']=false;
        }
    }
}