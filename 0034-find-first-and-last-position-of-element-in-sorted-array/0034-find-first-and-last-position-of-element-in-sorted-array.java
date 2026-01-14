class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findBound(nums, target, true);
        if (left == -1) {
            return new int[] {-1, -1};
        }
        int right = findBound(nums, target, false);

        return new int[] {left, right};
    }

    public int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int ans = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1; 
            }
        }
        
        return ans;
    }

}