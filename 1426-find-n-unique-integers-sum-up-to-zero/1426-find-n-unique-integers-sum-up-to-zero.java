class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int end = n % 2 == 0 ? n : n-1;

        for (int i = 1; i < end; i += 2) {
            if (n == 1) {
                result[0] = 1;
                return result;
            }

            result[i-1] = i;
            result[i] = -i;
        }

        if (end == n-1) {
            result[n-1] = 0;
        }

        return result;
    }
}