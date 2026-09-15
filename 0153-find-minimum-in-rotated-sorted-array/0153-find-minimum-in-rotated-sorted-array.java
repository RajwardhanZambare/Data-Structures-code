class Solution {
    public int findMin(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            //check if left portion is sorted or not
            if(nums[left] <= nums[mid]){
                //therefore it is sorted
                smallest = smallest < nums[left] ? smallest : nums[left];
                left = mid + 1;
            }
            else{
                smallest = smallest < nums[mid] ? smallest : nums[mid];
                right = mid - 1;
            }
        }
        return smallest;
    }
}