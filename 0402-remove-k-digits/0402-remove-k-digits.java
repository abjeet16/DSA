class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        for(char ch : num.toCharArray()){
            int n = ch-'0';
            if(s.isEmpty()){
                if(n!=0)s.push(n);
            }else{
                while(!s.isEmpty()&&k>0&&s.peek()>n){
                    s.pop();
                    k--;
                }
                if(n!=0||!s.isEmpty())s.push(n);
                //System.out.println(s+" "+k);
            }
        }
        if(k>=s.size())return "0";
        while(!s.isEmpty()){
            int n = s.pop();
            if(k>0){
                if(n!=0)k--;
            }else{
                res.append(n);
            }
        }
        if(res.length()==0)return "0";
        return res.reverse().toString();
    }
}