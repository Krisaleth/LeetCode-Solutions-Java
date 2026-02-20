class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;

        while (i < numbers.length) {
            int diff = target - numbers[i];
            int left = i + 1;
            int right = numbers.length;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (numbers[mid] == diff) {
                    return new int[] {i+1, mid+1};
                }
                else if (numbers[mid] > diff) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }
            i++;
            
        }
        return new int[] {-1, -1};
    }
}
