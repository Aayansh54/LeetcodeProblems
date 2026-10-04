class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int required = target - nums[i];
            if(mp.containsKey(required)){
                ans[0] = mp.get(required);
                ans[1] = i;
            }
            mp.put(nums[i] , i);
        }
        return ans;
    }
}