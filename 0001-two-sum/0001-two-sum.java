class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int required = target - nums[i];
            if(mp.containsKey(required)){
              return new int[]{i,mp.get(required)};
            }
            mp.put(nums[i] , i);
        }
        return new int[2];
    }
}