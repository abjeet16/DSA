class Solution {
    public static String removeOuterParentheses(String s) {
        int openCount = 0;
        int len = s.length();
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (ch=='('){
                openCount++;
                if (openCount!=1)
                    str.append(ch);
            }else {
                openCount--;
                if (openCount != 0)
                    str.append(ch);
            }
        }
        return str.toString();
    }
}