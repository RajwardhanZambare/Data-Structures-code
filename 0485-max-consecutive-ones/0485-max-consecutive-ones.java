class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
                maxCount = currentCount > maxCount ? currentCount : maxCount;
                
            }
            else{
                currentCount = 0;
            }
        }
        
        return maxCount;
    }
}