class Solution {
    public static int minLength(String s) {
        int len = s.length();
        char[] ch = new char[len];
        ch[0]=s.charAt(0);
        int res = 1;
        int index = 1;
        for (int i = 1 ; i < len ; i++){
            if (index>0&&((s.charAt(i)=='B'&&ch[index-1]=='A')||
                    s.charAt(i)=='D'&&ch[index-1]=='C')){
                res--;
                index--;
            }else {
                ch[index]=s.charAt(i);
                index++;
                res++;
            }
        }
        return res;
    }

}