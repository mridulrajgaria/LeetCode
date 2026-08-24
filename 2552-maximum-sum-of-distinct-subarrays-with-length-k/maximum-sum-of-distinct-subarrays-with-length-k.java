class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long answer = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        if (map.size() == k) {
            answer = sum;
        }
        for (int j = k; j < nums.length; j++) {
            sum += nums[j];
            map.put(
                nums[j],
                map.getOrDefault(nums[j], 0) + 1
            );
            int removed = nums[j - k];
            sum -= removed;
            map.put(
                removed,
                map.get(removed) - 1
            );
            if (map.get(removed) == 0) {
                map.remove(removed);
            }
            if (map.size() == k) {
                answer = Math.max(answer, sum);
            }
        }

        return answer;
    }
}