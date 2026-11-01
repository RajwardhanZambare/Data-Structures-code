class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < (1 << nums.length); i++){
            List<Integer> ls = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if((i & (1 << j)) != 0){
                    ls.add(nums[j]);
                }
            }
            res.add(ls);
        }
        return res;
    }
}