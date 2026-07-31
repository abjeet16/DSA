class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        StringBuilder res = new StringBuilder("11");
        for(int i = 2; i < n ; i++){
            res = getRLE(res.toString());
        }
        return res.toString();
    }
    private StringBuilder getRLE(String str){
        int c = 0;
        char prev = '0';
        StringBuilder res = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(prev=='0'){
                prev = ch;

            }
            if(prev!=ch){
                res.append(c+""+prev);
                prev = ch;
                c=1;
            }else{
                c++;
            }
        }
        return res.append(c+""+prev);
    }
}