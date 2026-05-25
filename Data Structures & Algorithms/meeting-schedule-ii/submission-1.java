/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int rooms=0;

        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        for (Interval meet : intervals){
            if (!pq.isEmpty() && meet.start>=pq.peek()) {
                pq.poll();
                pq.offer(meet.end);
            continue;

            }
            pq.offer(meet.end);
            rooms++;

        }
return rooms;

    }
}
