class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[intervals.length + 1][2];
        int i = 0;
        int n = intervals.length;
        int j = 0;

        //left portion
        while(i < n && intervals[i][1] < newInterval[0]){
            result[j][0] = intervals[i][0];
            result[j][1] = intervals[i][1];
            i++;
            j++;
        }

        //middle portion (portion that will be overlapping)
        while(i < n && intervals[i][0] <= newInterval[1]){
            //convert all the overlapping intervals into one non-overlapping interval
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        result[j][0] = newInterval[0];
        result[j][1] = newInterval[1];
        j++;

        //right portion (portion that will be left and already be non-overlapping)
        while(i < n){
            result[j][0] = intervals[i][0];
            result[j][1] = intervals[i][1];
            j++;
            i++;
        }

        return Arrays.copyOf(result, j);
    }
}