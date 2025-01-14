class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] res = new int[A.length];
        int common = 0;

        for(int i = 0; i< A.length; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if(map.get(A[i]) == 2) {
                ++common;
            }
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);

             if(map.get(B[i]) == 2) {
                ++common;
            }
            res[i] = common;
        }

        return res;
    }
}