class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        return search(nums, target, start, end);

    }

    static int search(int[] nums, int target, int start, int end) {
        if (start > end) {
            // not found
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return search(nums, target, mid + 1, end);
        }
        return search(nums, target, start, mid - 1);

    }
}