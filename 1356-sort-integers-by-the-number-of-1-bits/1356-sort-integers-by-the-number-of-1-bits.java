class Solution {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[] bitCount = new int[len];
        Arrays.sort(arr);
        for (int i = 0; i < len ; i++){
            bitCount[i] = getBitCount(arr[i]);
        }
        sort(arr,bitCount,len);
        return arr;
    }

    private void sort(int[] arr, int[] bitCount,int n) {
        for (int i = 0 ; i < n ; i++){
            int min = i;
            for (int j = i+1 ; j < n ; j++){
                if (bitCount[min] > bitCount[j] ||
                        (bitCount[min] == bitCount[j] && arr[min] > arr[j])) {
                    min = j;
                }
            }
            swap(arr,bitCount,i,min);
        }
    }

    private void swap(int[] arr, int[] bitCount, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        temp = bitCount[i];
        bitCount[i] = bitCount[j];
        bitCount[j] = temp;
    }

    private int getBitCount(int i) {
        int res = 0;
        while (i!=0){
            res+=i%2;
            i/=2;
        }
        return res;
    }
}