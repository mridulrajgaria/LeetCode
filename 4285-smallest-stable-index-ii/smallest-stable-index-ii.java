class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < min[i + 1]) {
                min[i] = nums[i];
            } else {
                min[i] = min[i + 1];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            int instability = max - min[i];
            if (instability <= k) {
                return i;
            }
        }
        return -1;
    }
}