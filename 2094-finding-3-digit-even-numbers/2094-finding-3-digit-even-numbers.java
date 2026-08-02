class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int len = digits.length;
        for(int i = 0 ; i < len ; i++){
            if(digits[i]==0)
                continue;
            for(int j = 0 ; j < len ; j++){
                for(int k = 0 ; k < len ; k++){
                    if(i==j||i==k||j==k)
                        continue;
                    int num = digits[i]*100+digits[j]*10+digits[k];
                    if(num%2==0)
                        set.add(num);
                }
            }
        }
        List<Integer> resultList = new ArrayList<>(set);
        Collections.sort(resultList);

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}