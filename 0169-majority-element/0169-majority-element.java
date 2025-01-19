class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for(int i = 0; i < len; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > len/2){
                return entry.getKey();
            }

        }

        return -1;
    }
}