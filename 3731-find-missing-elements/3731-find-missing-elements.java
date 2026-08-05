class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = smallest; i <= largest; i++){
            if(!isPresent(i, nums)){
                ans.add(i);
            }
        }

        return ans;
    }
    public boolean isPresent(int num,int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }
}