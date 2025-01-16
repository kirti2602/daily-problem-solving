/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n-1;

        if(n == 1 && isBadVersion(1)){
            return 1;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            if(isBadVersion(mid+1)){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return start+1;
    }
}