class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int k = findK(nums);
        leftRotate(nums, k);
        return binarySearch(nums, target, k);
    }
    public int findK(int[] nums){
        int smallest = Integer.MAX_VALUE;
        int sIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
                sIndex = i;
            }
        }
        return sIndex;
    }
    public void leftRotate(int[] nums, int k){
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    public void reverse(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public int binarySearch(int[] nums, int target, int k){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return (mid + k) % nums.length;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
        }
        return -1;
    }
}