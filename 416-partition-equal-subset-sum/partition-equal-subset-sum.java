class Solution {
    public boolean canPartition(int[] nums) {

        int total = 0;

        for (int x : nums) {
            total += x;
        }

        // Odd total cannot be divided equally
        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int x : nums) {

            for (int j = target; j >= x; j--) {

                if (dp[j - x]) {
                    dp[j] = true;
                }
            }
        }

        return dp[target];
    }
}