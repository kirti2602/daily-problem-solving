class Solution {
    public int splitArray(int[] nums, int k) {
        // Find minimum sum
        // Find maximum sum
        // Apply BS
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int arrayCount = 1;
            
            for(int num : nums){
                if(sum + num > mid){
                    // Create a new array
                    arrayCount++;
                    sum = num;
                }else{
                    sum += num;
                }
            }

            if(arrayCount > k){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        return start;
    }
}