class Solution {
    public int search(int[] nums, int target) {
        int index = findIndex(nums, target, 0, nums.length-1);
        return index;
    }

    static int findIndex(int [] nums, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e - s)/2;

        if(nums[m] == target){
            return m;
        }

        if(nums[s] <= nums[m]){
            if(nums[s] <= target &&  nums[m] >= target){
                return findIndex(nums, target, s, m-1);
            }else{
                return findIndex(nums,target, m+1, e);
            }
        }

        if(target >= nums[m] && target <= nums[e]){
            return findIndex(nums,target, m+1, e);
        }

return findIndex(nums,target, s, m-1);
    }
    
}