class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] candidates, int target, int idx) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) return;

        for (int i = idx; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(res, temp, candidates, target - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}
