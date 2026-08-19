class Solution {
    public boolean check(int[] nums) {
        if(isSorted(nums)){
            return true;
        }
        for(int i = 0; i < nums.length - 1; i++){
            int[] copy = nums.clone();
            reverse(copy, 0, i);
            reverse(copy, i + 1, copy.length - 1);
            reverse(copy, 0, copy.length - 1);
            if(isSorted(copy)){
                return true;
            }
        }
        return false;
    }
    public void reverse(int[] nums, int startIndex, int endIndex){
        int left = startIndex;
        int right = endIndex;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public boolean isSorted(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] <= nums[j]){
                i++;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}