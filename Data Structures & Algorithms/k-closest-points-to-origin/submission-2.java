
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            int distA = a[0] * a[0] + a[1] * a[1];
            int distB = b[0] * b[0] + b[1] * b[1];
            return distA - distB;
        });

        for (int[] p : points) {
            minHeap.offer(p);
        }

        int[][] res = new int[k][2];

        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }

        return res;
    }
}