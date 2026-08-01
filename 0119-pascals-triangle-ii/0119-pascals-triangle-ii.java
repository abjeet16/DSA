class Solution {
    public static List<Integer> getRow(int numRows) {
        int count = 0;
        List<Integer> lastRow = new ArrayList<>(List.of(1));
        while (count<numRows){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.addFirst(1);
            for (int i = 0 ; i < count;i++){
                currentRow.add(lastRow.get(i)+lastRow.get(i+1));
            }
            currentRow.add(1);
            lastRow = currentRow;
            count++;
        }
        return lastRow;
    }
}