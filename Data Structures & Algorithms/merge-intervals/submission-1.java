
class Solution {
    public int[][] merge(int[][] intervals) {
      int i =0;
      List<int[]> res=new ArrayList<>();
      Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));

      
      while (i<intervals.length){
        int curr=i;
        int end=intervals[i][1];

        while (i+1<intervals.length && end>=intervals[i+1][0]){
        
          i++;
          end=Math.max(end,intervals[i][1]);


        }
      
          res.add(new int[]{intervals[curr][0],end});

        
        i++;
        
        
      }
      int[][] nums=new int[res.size()][2];
      int j=0;

      for(int [] val: res ){
        nums[j][0]=val[0];
        nums[j][1]=val[1];
        j++;

      }
      return nums;

    }
}
