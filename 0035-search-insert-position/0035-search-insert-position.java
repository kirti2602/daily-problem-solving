class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            } else if(nums[0] < target){
                return 0+1;
            }
        }

        if(target > nums[end]){
            return end+1;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid;
            }else if(target > nums[mid]){
                start = mid+1;
            } else if(target == nums[mid]){
                return mid;
            }
        }

        return start;
    }
}