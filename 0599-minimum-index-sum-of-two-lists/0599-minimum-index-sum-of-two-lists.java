class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> resList = new ArrayList<>();
        int resCount = Integer.MAX_VALUE;
        for (int i = 0 ; i < list1.length ; i++){
            map.put(list1[i],i);
        }
        for (int i = 0 ; i < list2.length ;i++){
            String currStr = list2[i];
            if (map.containsKey(currStr)){
                if (resCount>i+ map.get(currStr)){
                    resList = new ArrayList<>();
                    resList.add(currStr);
                    resCount = i+ map.get(currStr);
                } else if (resCount==i + map.get(currStr)) {
                    resList.add(currStr);
                }
            }
        }
        String[] res = new String[resList.size()];
        for (int i = 0 ; i < res.length ;i++)
            res[i] = resList.get(i);
        return res;
    }
}