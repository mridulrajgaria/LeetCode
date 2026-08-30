class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int sm = 0;
        int lm = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                lm = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                sm = i;
            }
        }

        int left = Math.min(sm, lm);
        int right = Math.max(sm, lm);
        int n = nums.length;

        int removeLeft = right + 1;
        int removeRight = n - left;
        int removeBoth = (left + 1) + (n - right);

        return Math.min(removeLeft,
               Math.min(removeRight, removeBoth));
    }
}