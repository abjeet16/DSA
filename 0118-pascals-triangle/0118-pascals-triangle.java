class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        if (numRows>=1){
            answer.add(new ArrayList<>(List.of(1)));
        }
        if (numRows>=2){
            answer.add(new ArrayList<>(List.of(1,1)));
        }
        int count = 1;
        while (count<numRows-1){
            List<Integer> item = answer.get(count);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.addFirst(1);
            for (int i = 0 ; i < count;i++){
                currentRow.add(item.get(i)+item.get(i+1));
            }
            currentRow.add(1);
            answer.add(currentRow);
            count++;
        }
        return answer;
    }
}