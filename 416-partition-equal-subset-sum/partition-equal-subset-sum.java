class Solution {

    public boolean canPartition(int[] arr) {

        int n = arr.length;

        // Step 1: Calculate total sum
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        // Step 2: Odd total cannot be divided equally
        if (sum % 2 != 0) {
            return false;
        }

        // Step 3: Find a subset with sum = total / 2
        int target = sum / 2;

        return subsetSum(arr, target);
    }

    private boolean subsetSum(int[] arr, int sum) {

        int n = arr.length;

        boolean[][] t = new boolean[n + 1][sum + 1];

        // Sum 0 is always possible
        for (int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if (arr[i - 1] <= j) {

                    t[i][j] =
                        t[i - 1][j] ||
                        t[i - 1][j - arr[i - 1]];

                } else {

                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}