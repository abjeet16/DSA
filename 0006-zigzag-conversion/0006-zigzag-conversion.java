class Solution {
    public String convert(String s, int n) {
        if (s.length() == 1||n==1)
            return s;
        char[][] mat = new char[n][s.length()];
        StringBuilder res = new StringBuilder();
        for (char[] row : mat)
            Arrays.fill(row, '0');

        boolean ud = true;
        int row = 0, col = 0;
        int i = 0;
        while (i < s.length()) {
            int limit = Math.min(s.length(), i + n - 1);
            while (i < limit) {
                mat[row][col] = s.charAt(i);
                if (ud) {
                    row++;
                } else {
                    col++;
                    row--;
                }
                i++;
            }
            ud = !ud;
        }
        /*for (char[] r : mat)
            System.out.println(Arrays.toString(r));*/
        for (i = 0; i < n; i++) {
            for (int j = 0; j <= col; j++) {
                if (mat[i][j] != '0')
                    res.append(mat[i][j]);
            }
        }
        return res.toString();
    }

    private void placeUpDown(int i, int n, int s, char[][] mat) {

    }
}