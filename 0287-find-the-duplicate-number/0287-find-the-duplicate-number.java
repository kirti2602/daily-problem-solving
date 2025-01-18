class Solution {
    public int findDuplicate(int[] nums) {
        int[] newArr = Arrays.copyOf(nums, nums.length);
        int i = 0;
        while(i < newArr.length){
            int correctIndex = newArr[i] - 1;

            if(newArr[i] != newArr[correctIndex]){
                //swap
                int temp = newArr[i];
                newArr[i] = newArr[correctIndex];
                newArr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0; j < newArr.length; j++){
            if(newArr[j] != j+1){
                return newArr[j];
            }
        }

        return -1;
    }
}