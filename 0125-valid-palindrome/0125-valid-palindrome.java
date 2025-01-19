class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current >= 48 && current <= 57 || current >= 65 && current <= 90 || current >= 97 && current <= 122) {
                string.append(Character.toLowerCase(current));
            }
        }

        for(int i = string.length()-1; i >= 0 ; i--){
            if(string.charAt(i) != string.charAt(string.length() - i - 1)){
                return false;
            }
        }

        return true;
    }
}