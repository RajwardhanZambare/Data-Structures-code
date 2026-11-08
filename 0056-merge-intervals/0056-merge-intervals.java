class Solution {
    public int[][] merge(int[][] intervals) {
        //this approach only works for contiguos non-overlapping intervals. if there is gap between two or more non-overlapping intervals then it wont

        // if(intervals.length == 1) return intervals;
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // int n = intervals.length;
        // int[][] result = new int[n][2];
        // int i = 0;
        // while(i < n - 1 && intervals[i][1] < intervals[i + 1][0]){
        //     result[i][0] = intervals[i][0];
        //     result[i][1] = intervals[i][1];
        //     i++;
        // }
        // int j = i + 1;
        // while(j < n - 1 && intervals[j][1] >= intervals[j + 1][0]){
        //     j++;
        // }
        // result[i][0] = intervals[i][0];
        // result[i][1] = intervals[j][1];
        // i++;
        // j++;
        // while(j < n){
        //     result[i++] = intervals[j++];
        // }
        // return Arrays.copyOf(result, j - 1);

        if(intervals.length == 1) return intervals;
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] currentPair = new int[2];
        currentPair = intervals[0];
        int[][] result = new int[n][2];
        int resIndex = 0;
        for(int i = 1; i < n; i++){
            if(isOverlap(currentPair, intervals[i])){
                currentPair = mergePair(currentPair, intervals[i]);
                continue;
            }
            result[resIndex] = currentPair;
            resIndex++;
            currentPair = intervals[i];
        }
        result[resIndex] = currentPair;
        resIndex++;
        return Arrays.copyOf(result, resIndex);
    }
    private boolean isOverlap(int[]currentPair, int[]nextPair){
        if(currentPair[1] >= nextPair[0]){
            return true;
        }
        return false;
    }
    private int[] mergePair(int[] pair1, int[] pair2){
        int[] result = new int[2];
        result[0] = Math.min(pair1[0], pair2[0]);
        result[1] = Math.max(pair1[1], pair2[1]);
        return result;
    }
}