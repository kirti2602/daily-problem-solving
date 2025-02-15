class Solution {
    public int commonFactors(int a, int b) {
        int smallestNum = a < b ? a : b;
        int count = 0;

        for(int i = 1; i <= smallestNum; i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }

        return count;
    }
}