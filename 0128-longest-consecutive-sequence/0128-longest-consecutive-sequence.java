class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 1;
        for(int num : set){
            if(set.contains(num - 1)){
                continue;
            }
            else{
                int startingPoint = num;
                int i = 1;
                int count = 1;
                while(true){
                    if(set.contains(startingPoint + i)){
                        count++;
                    }
                    else{
                        break;
                    }
                    i++;
                }
                longest = longest > count ? longest : count;
            }
        }

        return longest;
    }
}