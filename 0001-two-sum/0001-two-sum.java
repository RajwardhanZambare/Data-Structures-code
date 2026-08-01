class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int first = 0, second = 0;
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                first = hm.get(target - nums[i]);
                second = i;
                break;
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return new int[]{first, second};
    }
}