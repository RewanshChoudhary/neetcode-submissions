

class Solution {
    List<List<Integer>> lst = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> curr = new ArrayList<>();
        backtrack(nums, target, 0, curr);
        return lst;

    }

    public void backtrack(int[] nums, int target, int index, List<Integer> curr) {
        if (target == 0) {
            lst.add(new ArrayList<>(curr));
            return;
        }
        if (target<0 ||  index>=nums.length) return;

        curr.add(nums[index]);
        backtrack(nums, target-nums[index],index, curr);
        curr.remove(curr.size()-1);
        backtrack(nums,target,index+1,curr);
        
    }  
}
