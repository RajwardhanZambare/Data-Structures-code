class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
        
        int pIndex = 0;
        int nIndex = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                answer[pIndex] = nums[i];
                pIndex += 2;
            }
            else{
                answer[nIndex] = nums[i];
                nIndex += 2;
            }
        }

        return answer;
    }
}