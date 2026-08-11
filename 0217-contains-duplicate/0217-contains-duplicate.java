class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                // int count = hm.get(nums[i]);
                // hm.put(nums[i], ++count);
                return true;
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        return false;
    }
}