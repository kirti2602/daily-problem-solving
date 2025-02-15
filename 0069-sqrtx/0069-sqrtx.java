class Solution {
    public int mySqrt(int x) {
        // binary search square root

        if(x == 0 || x == 1){
            return x;
        }

        int start = 2;
        int end = x;
        int mid = 0;


        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid < x/mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }

}