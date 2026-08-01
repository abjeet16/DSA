class Solution {
    public int myAtoi(String s) {
        StringBuilder resS = new StringBuilder();
        int i = 0;
        int n = s.length();
        while(i<n&&s.charAt(i)==' ')i++;
        if(i==s.length())return 0;
        boolean neg = false;
        if(s.charAt(i)=='-'){
            neg = true;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<n&&s.charAt(i)=='0')i++;
        if(i==s.length())return 0;

        while(i<n){
            char ch = s.charAt(i);
            if(ch<'0'||ch>'9')break;
            resS.append(ch);
            i++;
        }
        if(resS.length()==0)return 0;
        long num = 0;
        for(i = 0; i < resS.length() ; i++){
            num = num*10+(resS.charAt(i)-'0');
            if(num>Integer.MAX_VALUE){
                return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
        }
        if(neg)num = -num;
        return (int)num;
    }
}