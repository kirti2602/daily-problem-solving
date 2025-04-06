class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int copyX = x;
        if(x < 0){
            return false;
        }

        while(copyX != 0){
            int lastDigit = copyX % 10;
             res = res * 10 + lastDigit;
            copyX = copyX / 10;
        }

        if(res == x){
            return true;
        }

        return false;
    }
}