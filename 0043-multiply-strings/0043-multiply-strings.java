class Solution {
    public String multiply(String n1, String n2) {
        int m = n1.length(),n = n2.length();
        int[] res = new int[m+n];
        
        n1 = rev(n1);
        n2 = rev(n2);

        for(int i =  0 ; i < m ; i++){
            int s = i;
            int carry = 0;
            for(int j = 0 ; j < n ; j++){
                int mul = (n1.charAt(i)-'0')*(int)(n2.charAt(j)-'0')+res[s]+carry;
                //System.out.println(mul);
                int rem = mul%10;
                carry = mul/10;
                res[s++]=rem;
                //System.out.println(Arrays.toString(res));
            }
            if(carry!=0)res[s]=carry;
        }
        return formString(res);
    }
    private String rev(String s){
        int left = 0 , right = s.length()-1;
        char[] chars = s.toCharArray();
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;right--;
        }
        return new String(chars);
    }
    private String formString(int[] nums){
       int i = nums.length-1;
       while(i>=0&&nums[i]==0)i--;
        if(i==-1)return "0";
        StringBuilder res = new StringBuilder();
       while(i>=0){ 
        res.append(nums[i]);
        i--;
       }
       return res.toString();
    }
}