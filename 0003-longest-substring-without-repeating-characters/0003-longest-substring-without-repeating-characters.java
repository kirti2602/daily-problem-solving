class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

        if (s.length() < 2) {
            return s.length();
        }

        int right = 0;
        int left = 0;

        while (right < s.length()) {
            char charAtRight = s.charAt(right);
            if (map.containsKey(charAtRight) && map.get(charAtRight) >= left) {
                int index = map.get(charAtRight);
                left = index + 1; // Move the left pointer
            }
            map.put(charAtRight, right);
            maxLength = Math.max(maxLength, right - left + 1);
            right++; // Move the right pointer as usual
        }

        return maxLength;
    }
}