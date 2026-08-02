class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length() < k)
            return false;

        int uniqueSub      = pow(2,k);
        HashSet<String> st = new HashSet<>();

        for(int i = k; i <= s.length(); i++) {
            String sub = s.substring(i-k, i);

            if(!st.contains(sub)) {
                st.add(sub);
                uniqueSub--;
            }

            if(uniqueSub == 0)
                return true;
        }

        return false;
    }

    private static int pow(int num, int k) {
        if (k==0)
            return 1;
        int res = pow(num,k/2);
        res*=res;
        if (k%2!=0)
            res*=num;
        return res;
    }
}