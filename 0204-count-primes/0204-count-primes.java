class Solution {
    public int countPrimes(int n) {
        boolean[] result = new boolean[n];
        int count = 0;


        
        for (int i = 2; i*i < n; i++){
            if(!result[i]){
                for(int k = i*2; k < n; k +=i){
                    result[k] = true;
                }
            }
        }

        for(int i = 2; i < n; i++){
            if(!result[i]){
                count++;
            }
        }


        return count;
        
    }
}