class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        char[] mergedCharArr = new char[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                mergedCharArr[k] = word1.charAt(i);
                i++;
                k++;
            }
            if (j < word2.length()) {
                mergedCharArr[k] = word2.charAt(j);
                j++;
                k++;
            }
        }

        String result = new String(mergedCharArr);

        return result;
    }
}