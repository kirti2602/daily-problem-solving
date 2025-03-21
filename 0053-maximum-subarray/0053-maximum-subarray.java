class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            int op1 = nums[i];
            int op2 = nums[i] + currSum;
            currSum = Math.max(op1, op2);

            if(currSum > maxSum){
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}