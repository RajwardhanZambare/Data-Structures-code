class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            hm.put(arr[i], i);
        }
        int ans = 0;
        int missingCount = k;
        for(int i = 1; i <= arr[arr.length - 1] + k; i++){
            if(!hm.containsKey(i)){
                missingCount--;
                if(missingCount == 0){
                    ans = i;
                    break;
                }
            }
        }
        return ans;
    }
}