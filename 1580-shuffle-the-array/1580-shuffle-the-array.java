class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        int i = 0;
        int j = n;
        for (int k = 0; k < n*2; k++){
            if (k % 2 ==0) {
                result[k] = nums[i];
                i++;
            }
            else {
                result[k] = nums[j];
                j++;
            }
        }
        return result;
        
    }
}