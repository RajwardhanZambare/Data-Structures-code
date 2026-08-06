class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int row : rows){
            for(int i=0; i<n; i++){
                matrix[row][i] = 0;
            }
        }

        for(int column : columns){
            for(int i=0; i<m; i++){
                matrix[i][column] = 0;
            }
        }
    }
}