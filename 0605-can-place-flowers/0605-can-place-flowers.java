class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i< flowerbed.length; i++){
            if(flowerbed.length == 1){
                if(flowerbed[0] == 0) return true;
                if(n == 0) return true;
                return false;
            }
            if(n == 0) break;
            if(flowerbed[i] == 1){
                continue;
            }else{
                if(i > 0 && i < flowerbed.length - 1){
                    if(flowerbed[i] == 0 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1 ){
                        flowerbed[i] = 1;
                        n = n-1;
                    }
                }

                if(i == flowerbed.length-1 && i > 0){
                    if(flowerbed[i] == 0 && flowerbed[i-1] != 1){
                        flowerbed[i] = 1;
                        n = n-1;
                    }
                }

                if (i == 0 && flowerbed.length > 1 && flowerbed[i+1] != 1){
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            }
        }

        if(n==0) return true;
        return false;
    }
}