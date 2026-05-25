class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int curr=0;
        int res=0;

        for (Interval meet : intervals){
            map.put(meet.start,map.getOrDefault(meet.start, 0)+1);
            map.put(meet.end,map.getOrDefault(meet.end, 0)-1);
            
            
           
        }
        for (int value : map.keySet()){
            curr+=map.get(value);
            res=Math.max(res,curr);

        }
        return res;

        
   


    }
}
