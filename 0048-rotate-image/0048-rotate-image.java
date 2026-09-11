class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i = 0; i < matrix.length; i++){
            reverseRow(matrix, i);
        }
    }
    public void transpose(int[][] matrix){
        int i = 0;
        int j = 0;
        while(i < matrix.length && j < matrix.length){
            int row = i;
            int col = j;
            while(row < matrix.length && col < matrix.length){
                swap(matrix, i, row, j, col);
                row++;
                col++;
            }
            i++;
            j++;
        }
    }
    public void swap(int[][] matrix, int i, int row, int j, int col){
        int temp = matrix[i][row];
        matrix[i][row] = matrix[col][j];
        matrix[col][j] = temp;
    }
    public void reverseRow(int[][] matrix, int row){
        int left = 0;
        int right = matrix.length - 1;
        while(left < right){
            int temp = matrix[row][left];
            matrix[row][left] = matrix[row][right];
            matrix[row][right] = temp;
            left++;
            right--;
        }
    }
}