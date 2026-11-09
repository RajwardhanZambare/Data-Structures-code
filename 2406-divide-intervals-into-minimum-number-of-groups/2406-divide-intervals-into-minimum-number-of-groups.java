class Solution {
    public int minGroups(int[][] intervals) {
        if(intervals.length == 1) return 1;
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i = 0; i < n; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0;
        int j = 0;
        int count = 0; //represents currently active overlapping intervals
        int maxCount = 0;
        while(i < n){
            if(start[i] <= end[j]){
                count++;
                maxCount = Integer.max(maxCount, count);
                i++;
            }
            else{
                count--;
                j++;
            }
        }
        return maxCount;


        // if(intervals.length == 1) return 1;
        // int n = intervals.length;
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // int count = 0;
        // int maxCount = 0;
        // for(int i = 0; i < n - 1; i++){
        //     count = 0;
        //     for(int j = i + 1; j < n; j++){
        //         if(intervals[i][1] >= intervals[j][0]){
        //             count++;
        //         }
        //     }
        //     maxCount = Integer.max(maxCount, count);
        // }
        // return maxCount == 0 ? 1 : maxCount;
    }
}