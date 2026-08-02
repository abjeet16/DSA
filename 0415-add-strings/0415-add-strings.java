class Solution {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            //if i less than 0 lets take it as 0 else we get the number 
            int n1 = i >= 0 ? num1.charAt(i--) - '0' : 0;//ex : '9' = 57 '0' = 48 , 57-48=9
            int n2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}