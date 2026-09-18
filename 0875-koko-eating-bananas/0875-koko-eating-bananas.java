class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maximum(piles);
        int k = Integer.MAX_VALUE;
        while(left <= right){
            int mid = (left + right) / 2;
            long ans = calculateHours(piles, mid);
            if(ans <= h){
                k = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return k;
    }
    public int maximum(int[] piles){
        int max = piles[0];
        for(int i = 1; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        return max;    
    }
    public long calculateHours(int[] piles, int mid){
        long sum = 0;
        for(int pile : piles){
            sum = sum + (int)Math.ceil((double)pile / mid);
        }
        return sum;
    }
}