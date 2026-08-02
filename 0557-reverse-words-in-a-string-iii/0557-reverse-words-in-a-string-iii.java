class Solution {
    public String reverseWords(String s) {
        char[] sArr = s.toCharArray();
        int length = s.length();
        int start = 0;
        for (int i = 1 ; i < length ;i++){
            if (sArr[i]==' ')
                reverse(sArr,start,i-1);
            if (sArr[i-1]==' ')
                start = i;
        }
        reverse(sArr,start,length-1);
        return new String(sArr);
    }

    public static void reverse(char[] ans, int i, int j){
        while(i<=j){
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
    }
}