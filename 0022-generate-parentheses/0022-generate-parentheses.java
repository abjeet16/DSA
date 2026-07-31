class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res,n,0,0,new StringBuilder());
        return res;
    }

    private void generate(List<String> res, int n, int open,int close, StringBuilder curr) {
        if (curr.length()==n*2){
            res.add(curr.toString());
            return;
        }
        if (open<n){
            curr.append("(");
            generate(res,n,open+1,close,curr);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (close<open){
            curr.append(")");
            generate(res,n,open,close+1,curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}