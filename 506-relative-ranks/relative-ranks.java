import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(score[b], score[a]));
        for (int i = 0; i < n; i++) {
            pq.offer(i);
        }
        String[] answer = new String[n];
        int rank = 1;
        while (!pq.isEmpty()) {
            int index = pq.poll();
            if (rank == 1) {
                answer[index] = "Gold Medal";
            } else if (rank == 2) {
                answer[index] = "Silver Medal";
            } else if (rank == 3) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(rank);
            }
            rank++;
        }
        return answer;
    }
}