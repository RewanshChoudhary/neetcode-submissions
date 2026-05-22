
class Solution {
    List<List<Integer>> lst = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        backtrack(nums, target, 0, new ArrayList<>());
        return lst;

    }

    public void backtrack(int[] nums, int target, int index, List<Integer> curr) {
       if (target==0){
        lst.add(new ArrayList<>(curr));

        return;

       }
       for (int i=index;i<nums.length;i++){
        if (i>index  && nums[i]==nums[i-1]) continue;
        if (target<0) break;

        curr.add(nums[i]);
        backtrack(nums,target-nums[i],i+1,curr);
        curr.remove(curr.size()-1);


         
       }
    }  
}
