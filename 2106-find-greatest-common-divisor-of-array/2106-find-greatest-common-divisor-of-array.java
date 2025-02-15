class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        return gcd(min, max);
        
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

        // Euclidean algo
        return gcd(b % a, a);
    }
}