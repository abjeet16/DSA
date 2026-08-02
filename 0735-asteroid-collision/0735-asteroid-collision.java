class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack  = new Stack<>();
        for(int i : a){
            boolean gr = goingRight(i);
            if(gr){
                stack.push(i);
            }else{
                int absi = Math.abs(i);
                while(!stack.isEmpty()&&goingRight(stack.peek())&&stack.peek()<absi){
                    stack.pop();
                }
                if(stack.isEmpty()||!goingRight(stack.peek())){
                    stack.push(i);
                }else if(stack.peek()==absi){
                    stack.pop();
                }
            }
        } 
        int len = stack.size();
        int[] res = new int[len];
        for (int i = len-1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
    private boolean goingRight(int i){
        return i>0;
    }
}