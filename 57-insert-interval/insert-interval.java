class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        for (int[] a : intervals) {
            result.add(a);
        }

        result.add(newInterval);

        result.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int start = result.get(0)[0];
        int end = result.get(0)[1];

        for (int i = 1; i < result.size(); i++) {

            int curstart = result.get(i)[0];
            int curend = result.get(i)[1];

            if (curstart <= end) {
                end = Math.max(end, curend);

            } else {
                merged.add(new int[]{start, end});
                start = curstart;
                end = curend;
            }
        }

        merged.add(new int[]{start, end});

        return merged.toArray(new int[merged.size()][]);
    }
}