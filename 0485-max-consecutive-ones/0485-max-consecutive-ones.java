class Solution {
     public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                
                if(i == nums.length -1){
                    map.put(i, count);
                }
            }
            else{
                if(count > 0){
                    map.put(i, count);
                    count = 0;
                }
            }
        }

        int maxRepeat = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(maxRepeat < value){
                maxRepeat = value;
            }
        }

        return maxRepeat;
    }
}