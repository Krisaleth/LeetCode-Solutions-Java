class Solution {
    public int[] findErrorNums(int[] nums) {
        int total = 0;
        int[] result = new int[2];
        int n = nums.length;
        int exceptTotal = (n * (n + 1)) / 2;
        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int s : nums) {
            total += s;
        }

        for (int i = 0; i < n; i++) {
            if (numsMap.containsKey(nums[i])) {
                result[0] = nums[i];
                result[1] = exceptTotal - (total - nums[i]);
            }
            else {
                numsMap.put(nums[i], i);
            }
        }
        return result;
    }
}