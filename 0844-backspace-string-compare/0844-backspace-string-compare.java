class Solution {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int bsc1 = 0;
        int bsc2 = 0;
        int i = s.length()-1;
        int j = t.length()-1;
        while (i>=0&&j>=0){
            if (s.charAt(i)=='#'){
                bsc1++;
            }else {
                if (bsc1>0)
                    bsc1--;
                else
                    str1.append(s.charAt(i));
            }
            if (t.charAt(j)=='#'){
                bsc2++;
            }else {
                if (bsc2>0)
                    bsc2--;
                else
                    str2.append(t.charAt(j));
            }
            i--;
            j--;
        }
        while (i>=0){
            if (s.charAt(i)=='#'){
                bsc1++;
            }else {
                if (bsc1>0)
                    bsc1--;
                else
                    str1.append(s.charAt(i));
            }
            i--;
        }
        while (j>=0){
            if (t.charAt(j)=='#'){
                bsc2++;
            }else {
                if (bsc2>0)
                    bsc2--;
                else
                    str2.append(t.charAt(j));
            }
            j--;
        }
        return str1.compareTo(str2) == 0;
    }
}