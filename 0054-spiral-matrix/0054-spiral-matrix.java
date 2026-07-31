class Solution {
       public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;

        int sRow = 0, eRow = m - 1;
        int sCol = 0, eCol = n - 1;

        while (sRow<=eRow&&sCol<=eCol){
            for (int i = sCol ; i <= eCol ; i++)
                ans.add(matrix[sRow][i]);
            sRow++;
            for (int i = sRow;i<=eRow;i++)
                ans.add(matrix[i][eCol]);
            eCol--;
            if (sRow<=eRow)
                for (int i = eCol;i>=sCol;i--)
                    ans.add(matrix[eRow][i]);
            eRow--;
            if (sCol<=eCol)
                for (int i = eRow;i>=sRow;i--)
                    ans.add(matrix[i][sCol]);
            sCol++;
        }
        return ans;
    }

}
