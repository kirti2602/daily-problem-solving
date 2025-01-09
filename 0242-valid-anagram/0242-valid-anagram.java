class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrT = t.toCharArray();
        char[] arrS = s.toCharArray();
        Arrays.sort(arrT);
        Arrays.sort(arrS);

        if(String.valueOf(arrS).equals(String.valueOf(arrT))){
            return true;
        }

        return false;

    }
}