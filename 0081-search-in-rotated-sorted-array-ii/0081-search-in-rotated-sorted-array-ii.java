class Solution {
    public boolean search(int[] nums, int target) {
        int peakIndex = findPeakIndex(nums); // -1 or greater than -1

        if(nums.length == 1){
            return nums[0] == target ? true : false;
        }


        boolean firstHalf = binarySearch(nums, target, 0, peakIndex != -1 ? peakIndex : nums.length-1 );
        if(firstHalf != false){
            return firstHalf;
        } else if(peakIndex != -1) {
            boolean secondHalf = binarySearch(nums, target, peakIndex+1, nums.length-1 );
            return secondHalf;
        }
        return false;
    }


    static int findPeakIndex(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }else if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }else if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(nums[start] > nums[start+1]){
                    return start;
                }

                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                start++;
                end--;
            }else if(nums[start] <= nums[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }

        return -1;
    }

    static boolean binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] < target){
                start = mid+1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else {
                return true;
            }
        }

        return false;
    }
}