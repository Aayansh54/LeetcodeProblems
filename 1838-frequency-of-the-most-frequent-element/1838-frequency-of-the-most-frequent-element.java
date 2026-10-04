class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int n = nums.length;

        Arrays.sort(nums);

        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int freq = 0;
        for(int r = 0 ; r < n ; r++){
            freq = Math.max(freq,BinSearch(r,k,nums,prefix));
        }
        return freq;
    }
    int BinSearch(int target_idx, int k , int[]nums,long[] prefix){
        int left = 0;
        int right = target_idx;
        int ans = 0;
        while(left <= right){
            int mid = (left + right)/2;
            long len = target_idx - mid + 1;
            long reqSum = len * nums[target_idx];
            long relSum = prefix[target_idx] - prefix[mid] + nums[mid];
            if(reqSum - relSum <= k){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return target_idx - ans + 1;   
    }
}