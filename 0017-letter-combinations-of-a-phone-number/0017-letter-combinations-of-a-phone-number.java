class Solution {
    private String getChars(int digit){
        return switch(digit){
            case 2->"abc";
            case 3->"def";
            case 4->"ghi";
            case 5->"jkl";
            case 6->"mno";
            case 7->"pqrs";
            case 8->"tuv";
            case 9->"wxyz";
            default->"";
        };
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        getComb(res,digits,0,new StringBuilder());
        return res;
    }
    private void getComb(List<String> res,String d,int i,StringBuilder curr){
        if(i==d.length()){
            res.add(curr.toString());
            return;
        }
        String ch = getChars(d.charAt(i)-'0');
        for(int j = 0 ; j < ch.length() ; j++){
            curr.append(ch.charAt(j));
            getComb(res,d,i+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}