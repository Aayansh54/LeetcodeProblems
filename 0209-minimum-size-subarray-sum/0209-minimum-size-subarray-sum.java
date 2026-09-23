class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0 , r = 0;
        int n = nums.length;
        int min = n+1;
        int sum = 0;
        while(r < n){
            sum+= nums[r];
            while(sum >= target){
                min = Math.min(min,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return min == n+1 ? 0 : min;
    }
}