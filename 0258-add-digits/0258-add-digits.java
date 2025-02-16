class Solution {
    public int addDigits(int num) {
        int result = sum(num);

        if(result < 10){
            return result;
        }

        return addDigits(result);
    }

    static int sum(int num){
        if(num < 10){
            return num;
        }

        return ( num%10 ) + sum ( num / 10);
    }
}