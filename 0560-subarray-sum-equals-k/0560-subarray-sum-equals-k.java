class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        count.put(0,1);
        int n = nums.length;
        int sum = 0;
        int ans = 0;
        for(int i = 0; i < n ; i++){
            sum += nums[i];
            if(count.containsKey(sum - k)){
                ans += count.get(sum - k);
            }
            count.put(sum ,count.getOrDefault(sum,0) + 1);
        }
        return ans;
    }
}