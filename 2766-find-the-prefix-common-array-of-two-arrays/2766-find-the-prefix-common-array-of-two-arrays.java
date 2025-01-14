class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] res = new int[A.length];

        for(int i = 0; i< A.length; i++){
            int common = 0;
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);

            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() == 2){
                    common++;
                }
            }


            res[i] = common;
        }

        return res;
    }
}