class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()){
            if (i=='('||i=='['||i=='{')
                stack.add(i);
            else if (stack.isEmpty()) {
                return false;
            } else if (i==')'&&stack.pop()!='('){
                return false;
            } else if (i==']'&&stack.pop()!='[') {
                return false;
            } else if (i=='}'&&stack.pop()!='{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}