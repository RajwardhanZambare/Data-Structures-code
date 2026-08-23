class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int n = nums.length;

        for(int num : nums){
            if(hm.containsKey(num)){
                int count = hm.get(num);
                hm.put(num, ++count);
                if(count > n/3 && !answer.contains(num)){
                    answer.add(num);
                }
            }
            else{
                hm.put(num, 1);
                if(1 > n/3){
                    answer.add(num);
                }
            }
        }

        return answer;
    }
}