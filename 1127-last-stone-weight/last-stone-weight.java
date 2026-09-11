class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones) {
            pq.offer(x);
        }
        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if(a != b) {
                pq.offer(Math.abs(a - b));
            }
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}