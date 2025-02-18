class Solution {
    public void sortColors(int[] nums) {
        bubbleSort(nums, nums.length-1, 0);

    }

    static void bubbleSort(int[] nums, int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            if(nums[c] > nums[c+1]){
                //swap
                int temp = nums[c+1];
                nums[c+1] = nums[c];
                nums[c] = temp;

            }
        bubbleSort(nums, r, c+1);
        }else{
            bubbleSort(nums, r-1, 0);
        }
    }


}