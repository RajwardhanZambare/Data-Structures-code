class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num, 1);
        }

        int ans = 0;
        int iter = k;
        while(true){
            if(hm.containsKey(iter)){
                iter = iter + k;
            }
            else{
                ans = iter;
                break;
            }
        }

        return ans;
    }
}