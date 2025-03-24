class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int index = 0;

        while(i < nums.length){
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }

            int freq = j - i;

            if(freq > 1){
                nums[index] = nums[j-1];
                nums[index+1] = nums[j-1];
                index = index+2;
            }else{
                nums[index] = nums[j-1];
                index = index+1;
            }

            i = j;
        }

        return index;
    }
}