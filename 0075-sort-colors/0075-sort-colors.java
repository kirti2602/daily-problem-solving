class Solution {
public void sortColors(int[] nums) {
        
       
   for(int i = 0; i< nums.length; i++){
            int lastIndex = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, lastIndex);

            int temp = nums[maxIndex];
            nums[maxIndex] = nums[lastIndex];
            nums[lastIndex] = temp;
    }
    }

    static int getMaxIndex(int[] nums, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }
}