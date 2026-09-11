class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] arr = new int[k][2];

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a,b) -> b[2] - a[2]);

        for(int[] arr1 : points) {
            int x = arr1[0];
            int y = arr1[1];
            int d = (x*x) + (y*y);

            pq.offer(new int[]{x,y,d});

            if(pq.size() > k) {
                pq.poll();
            }
        }

        for(int i = 0; i < k; i++) {
            int[] arr2 = pq.poll();

            arr[i][0] = arr2[0];
            arr[i][1] = arr2[1];
        }

        return arr;
    }
}