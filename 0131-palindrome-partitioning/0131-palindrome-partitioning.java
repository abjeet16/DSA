class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        generate(res,new ArrayList<String>(),0,s);
        return res;
    }

    private void generate(List<List<String>> res, ArrayList<String> curr, int idx, String s) {
        if (idx==s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < s.length() ;i++){
            if(check(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                generate(res, curr, i+1, s);
                curr.removeLast();
            }
        }
    }

    private boolean check(String str , int i , int j){
        if (str.isEmpty())
            return false;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}