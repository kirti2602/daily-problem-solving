class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;

        while( i < nums.length){
             j = i+1;
            while(j < nums.length){
                if(nums[i] + nums[j] == target){
                     return new int[]{i, j};
                }

                j++;
            }
            i++;
        }

        return new int[]{-1, -1};
    }
}