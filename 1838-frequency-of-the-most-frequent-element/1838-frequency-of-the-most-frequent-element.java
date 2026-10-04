class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
     int n = nums.length;
     int ans = 0;
     int l = 0,r = 0;
     long winSum = 0;
     while(r < n){
        winSum += nums[r];
      

        if(( (long)(r-l+1) * nums[r] ) - winSum > k){
            winSum -= nums[l];
            l++;
        }

        ans = Math.max(ans,r - l + 1);
        r++;
     }
     return ans;
    }
}