class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0 , lessthancnt = 0;
        for(int x : nums){
            if(target == x) count++;
            if(x < target) lessthancnt++;
        }
        for(int i = 0 ; i < count ; i++){
            ans.add(lessthancnt++);
        }
        return ans;
    }
}