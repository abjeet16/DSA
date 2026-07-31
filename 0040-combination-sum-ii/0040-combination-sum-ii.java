class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(c); // important to handle duplicates
    backtrack(res, c, t, 0, new ArrayList<>());
    return res;
}

private void backtrack(List<List<Integer>> res, int[] c, int t, int idx, List<Integer> curr) {
    if (t == 0) {
        res.add(new ArrayList<>(curr));
        return;
    }

    for (int i = idx; i < c.length; i++) {
        // skip duplicates
        if (i > idx && c[i] == c[i - 1]) continue;

        if (c[i] > t) break;

        curr.add(c[i]);
        backtrack(res, c, t - c[i], i + 1, curr);
        curr.remove(curr.size() - 1);
    }
}

}