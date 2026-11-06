class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 1) return 0;
        sortByEndTime(intervals);
        int freeAtTime = Integer.MIN_VALUE;
        int validIntervals = 0;
        for(int i = 0; i < intervals.length; i++){
            //startTime >= freeAtTime
            if(intervals[i][0] >= freeAtTime){
                validIntervals++;
                freeAtTime = intervals[i][1]; //freeAtTime = endTime
            }
        }
        return intervals.length - validIntervals;
    }
    private void sortByEndTime(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
    }
}