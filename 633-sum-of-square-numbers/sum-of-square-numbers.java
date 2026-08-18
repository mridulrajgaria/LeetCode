class Solution {
    public boolean judgeSquareSum(int c) {
        int x = (int) Math.sqrt(c);

        int low = 0;
        int high = x;

        while (low <= high) {
            long sum = (long) low * low + (long) high * high;

            if (sum == c) {
                return true;
            } 
            else if (sum < c) {
                low++;
            } 
            else {
                high--;
            }
        }

        return false;
    }
}