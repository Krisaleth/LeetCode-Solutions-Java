class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }
        int longestSub = 1;

        for (int n : numSet) {
            if (numSet.contains(n - 1)) {
                continue;
            }
            else {
                int currNum = n;
                int currSub = 1;
                while (numSet.contains(currNum+1)) {
                    currNum++;
                    currSub++;
                }

                longestSub = Math.max(currSub, longestSub);
            }
        }

        return longestSub;
    }
}