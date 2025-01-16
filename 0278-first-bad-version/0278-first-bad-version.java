/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        if(n == 1 && isBadVersion(1)){
            return 1;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            if(!isBadVersion(mid)){
                start = mid+1;
            } else{
                end = mid;
            }
        }

        return start;
    }
}