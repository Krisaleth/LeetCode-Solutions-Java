class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high =  numbers.length - 1;

        while (low <= high) {
            if (numbers[low] + numbers[high] == target) {
                int[] result = new int[2];
                result[0] = low + 1;
                result[1] = high + 1;
                return result;
            }
            if (numbers[low] + numbers[high] > target) {
                high--;
            }
            else {
                low++;
            }
        }
        return null;
    }
}