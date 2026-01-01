class Solution {
    public int trap(int[] height) {
        int[] maxLeftArr = new int[height.length];
        int[] maxRightArr = new int[height.length];
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;
        int waterBlock = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] > maxLeft) {
                maxLeft = height[i];
            }
            maxLeftArr[i] = maxLeft;
        }

        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] > maxRight) {
                maxRight = height[i];
            }
            maxRightArr[i] = maxRight;
        }

        for (int i = 0; i < height.length; i++) {
            waterBlock = waterBlock + (Math.min(maxLeftArr[i], maxRightArr[i]) - height[i]);
        }

        return waterBlock;
    }
}