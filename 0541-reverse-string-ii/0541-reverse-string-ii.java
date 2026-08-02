class Solution {
   public void reverse(char ans[], int i, int j){
        while(i<=j){
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseStr(String s, int k) {
        int n = s.length();
        char ans[] = s.toCharArray();

        for(int i=0; i<n; i=i+2*k){
            int j = Math.min(i+k-1, n-1);
            reverse(ans, i, j);
        }

        return new String(ans);
    }
}