class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int end = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int[] chars = new int[26];

        while(end < s.length()){
            chars[s.charAt(end) - 'A']++;
            
            // Maximum repeating character
            maxFreq = Math.max(maxFreq, chars[s.charAt(end) - 'A']);

            int charsToReplace = (end - start + 1) - maxFreq;

            // More characters are needed to be replaced than given `k`, we move the left pointer
            if(charsToReplace > k){
                chars[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, (end - start + 1));

            end++;
        }

        return maxLength;
    }
}