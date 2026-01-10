class Solution {
    public String longestPalindrome(String s) {
        if (s.isEmpty() || s == null) {
            return "";
        }

        int right = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = palindromicSubstring(s, i, i);
            int len2 = palindromicSubstring(s, i, i+1);

            int len = Math.max(len1, len2);

            if (len > right-left) {
                left = i - (len-1)/2;
                right = i + len/2;
            }
        }

        return s.substring(left, right+1);
    }

    public int palindromicSubstring(String s, int left, int right) {
        int L = left, R = right;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1;
    }
}