class Solution {
    public void rotate(int[] nums, int k) {
        // Two pointers
        int len = nums.length;
        int rotations = k % len;
        reverse(nums,0, len-1);
        reverse(nums, 0, rotations-1);
        reverse(nums, rotations, len-1);
    }

    static void reverse(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}