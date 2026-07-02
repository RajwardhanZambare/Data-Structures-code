class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int currentArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int length = height[left] < height[right] ? height[left] : height[right]; 
            int breadth = right - left;
            currentArea = length * breadth;
            maxArea = currentArea > maxArea ? currentArea : maxArea;
            if(height[left] < height[right]){
                left++;
            } 
            else{
                right--;
            }
        } 
        return maxArea;
    }
}