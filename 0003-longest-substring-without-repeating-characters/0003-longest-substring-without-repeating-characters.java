class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int right = 0;
        int res = 0;
        Set<Character> checkSet = new HashSet<>();

        while (right < s.length()) {
                while (checkSet.contains(s.charAt(right))) {
                    checkSet.remove(s.charAt(left));
                    left++;
                }
                checkSet.add(s.charAt(right));
                res = Math.max(res, right - left + 1);
                right++;
        }

        return res;
    }
}