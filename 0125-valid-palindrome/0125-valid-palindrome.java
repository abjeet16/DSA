class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int right = 0 , left = s.length()-1;
        while(right<left){
            char rightChar = s.charAt(right);
            char leftChar = s.charAt(left);
            if (((rightChar>='a'&& rightChar<='z')||(rightChar>='0'&&rightChar<='9'))
                    &&
                    ((leftChar>='a'&&leftChar<='z')||(leftChar>='0'&&leftChar<='9')))
            {
                if (rightChar!=leftChar){
                    return false;
                }
                right++;
                left--;
            } else if ((rightChar>='a'&&rightChar<='z')||(rightChar>='0'&&rightChar<='9')) {
                left--;
            } else {
                right++;
            }
        }
        return true;
    }
}