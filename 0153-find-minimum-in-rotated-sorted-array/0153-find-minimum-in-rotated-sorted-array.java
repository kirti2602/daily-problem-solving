class Solution {
    public int findMin(int[] nums) {
        int pivotIndex = findPivot(nums);
        
        if(nums.length < 1){
            return nums[0];
        }
        
        return nums[pivotIndex+1];

    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }else if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            else if(nums[start] <= nums[mid]){
                start = mid+1;
            }else if(nums[start] > nums[mid]){
                end = mid-1;
            }
        }

        return -1;
    }

}