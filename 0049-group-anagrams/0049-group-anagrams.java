class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null) return new ArrayList<>();
        Map<String, List> sMap = new HashMap<>();

        for (String s : strs) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String strVal = String.valueOf(sArr);
            if (!sMap.containsKey(strVal))  {
                sMap.put(strVal, new ArrayList<>());
            }
            sMap.get(strVal).add(s);
        }
        return new ArrayList(sMap.values());

    }
}