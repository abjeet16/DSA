class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (char ch : s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(ch);
            } else if (ch == 'a'&&stack.peek()=='b') {
                stack.pop();
                res++;
            } else  {
                stack.push(ch);
            }
        }
        return res;
    }
}