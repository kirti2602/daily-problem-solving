class Solution {
    public boolean search(int[] nums, int target) {
        int peakIndex = findPeakIndex(nums); // -1 if no peak, or the index of the peak.

        if (nums.length == 1) {
            return nums[0] == target;
        }

        // Search in the two halves divided by the peak.
        boolean firstHalf = binarySearch(nums, target, 0, peakIndex != -1 ? peakIndex : nums.length - 1);
        if (firstHalf) {
            return true;
        }

        if (peakIndex != -1) {
            return binarySearch(nums, target, peakIndex + 1, nums.length - 1);
        }

        return false;
    }

    static int findPeakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Detect peak
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // Shrink the range cautiously
                if (start < nums.length - 1 && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > 0 && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] <= nums[mid]) {
                // Left side is sorted
                start = mid + 1;
            } else {
                // Right side is sorted
                end = mid - 1;
            }
        }

        return -1;
    }

    static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
