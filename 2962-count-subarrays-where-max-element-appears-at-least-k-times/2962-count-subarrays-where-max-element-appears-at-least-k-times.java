class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for(int x : nums){
            max = Math.max(max , x);
        }
        Map<Integer , Integer> freq = new HashMap<>();
        int l = 0; int r = 0;
        int n = nums.length;
        long ans = 0;
        while(r < n){
            if(nums[r] == max)
                freq.put(nums[r] , freq.getOrDefault(nums[r] , 0) + 1);
           
            while(freq.containsKey(max) && freq.get(max) >= k){
                ans += n - r;
                if(nums[l] == max){
                    freq.put(nums[r] , freq.get(max) - 1);
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}