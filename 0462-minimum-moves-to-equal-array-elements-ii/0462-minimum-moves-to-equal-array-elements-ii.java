class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int median= findMedian(nums);
        int ans = 0;
        for(int num : nums){
            ans = ans + (Math.abs(median - num));
        }
        return ans;
    }
    private int findMedian(int[] nums){
        mergeSort(nums, 0, nums.length - 1);
        return nums[nums.length / 2];
    }
    private void mergeSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } 
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        for(int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }
}