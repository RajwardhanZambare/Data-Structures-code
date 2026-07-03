class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //row
        int n = matrix[0].length; //coloumn
        int low = 0;
        int high = m - 1;
        int mid = low + (high - low) / 2;
        int row = -1;
        while(true){ //get row where target is present
            if(target < matrix[low][0]){
                return false;
            }
            if(target >= matrix[low][0] && target < matrix[mid][0]){
                high = mid;
            }
            else if(target >= matrix[mid][0] && target < matrix[high][0]){
                low = mid;
            }
            else if(target >= matrix[high][0]){
                row = high;
                break;
            }
            mid = low + (high - low) / 2;
            if(low == mid){
                row = low;
                break;
            }
        }
        int left = 0;
        int right = matrix[row].length - 1;
        for(int i=0; i<matrix[row].length; i++){ //apply binary search for the row which we found
            int center = left + (right - left) / 2;
            if(target == matrix[row][center]){
                return true;
            }
            else if(target >= matrix[row][left] && target < matrix[row][center]){
                right = center - 1;
            }
            else if(target > matrix[row][center] && target <= matrix[row][right]){
                left = center + 1;
            }
        }
        return false;
    }

}