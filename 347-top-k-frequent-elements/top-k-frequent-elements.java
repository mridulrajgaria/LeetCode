class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hr.put(nums[i], hr.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxNum = 0;
            for (int num : hr.keySet()) {

                if (hr.get(num) > maxFreq) {
                    maxFreq = hr.get(num);
                    maxNum = num;
                }
            }
            ans[i] = maxNum;
            hr.put(maxNum, -1);
        }
        return ans;
    }
}