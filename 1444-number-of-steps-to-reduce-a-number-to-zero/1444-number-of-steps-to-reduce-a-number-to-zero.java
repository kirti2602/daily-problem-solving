class Solution {
    public int numberOfSteps(int num) {
        return countSteps(num);
    }

    static int countSteps(int num){
        int count = 0;

        return helper(num, count);
    }

    static int helper(int num, int count){
        if(num == 0){
            return count;
        }

        if(num % 2 == 0){
            return helper(num/2, count+1);
        }else{
            return helper(num - 1, count+1);
        }
    }
}