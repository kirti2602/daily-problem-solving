class Solution {
    public int numFriendRequests(int[] ages) {
        // Using freq array
        int [] count = new int[121];
        int ans = 0;

        for(int i = 0; i < ages.length; i++){
            count[ages[i]]++;
        }

        for(int i = 0; i <= 120; i++){
            for(int j = 0; j <= 120; j++){
                int countA = count[i];
                int countB = count[j];

                if(checkCondition(i, j)) continue;

                ans += countA * countB;

                if(i == j){
                    ans -= countA;
                }

            }
        }

        return ans;
    }

    static boolean checkCondition(int x, int y) {
        boolean condition = (y <= 0.5 * x + 7) || (y > x) || (y > 100 && x < 100);

        return condition;
    }
}